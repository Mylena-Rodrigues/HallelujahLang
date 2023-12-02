package org.example.ast;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MethodCall implements ASTNode {
    private String methodName;
    private List<ASTNode> arguments;

    public MethodCall(String methodName, List<ASTNode> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Obtém a método da tabela de símbolos global
        MethodDeclaration method = (MethodDeclaration) symbolTable.get(methodName);

        // Verifica se a método existe
        if (method == null) {
            throw new RuntimeException("Método '" + methodName + "' não declarada.");
        }

        // Verifica se o número de argumentos coincide com o número de parâmetros
        List<ASTNode> parameters = method.getBody();
        if (arguments.size() != parameters.size()) {
            throw new RuntimeException("Número incorreto de argumentos para a método '" + methodName + "'.");
        }

        // Cria um novo escopo local para a execução da método
        Map<String, Object> localSymbolTable = new HashMap<>(method.getLocalSymbolTable());

        // Associa os argumentos aos parâmetros no escopo local
        for (int i = 0; i < parameters.size(); i++) {
            ASTNode parameter = parameters.get(i);
            Object argValue = arguments.get(i).execute(symbolTable);
            if (parameter instanceof VariableDeclaration) {
                VariableDeclaration variableDeclaration = (VariableDeclaration) parameter;
                localSymbolTable.put(variableDeclaration.getName(), argValue);
            } else {
                throw new RuntimeException("Parâmetro inválido na declaração da método '" + methodName + "'.");
            }
        }

        // Executa o corpo da método no novo escopo local
        for (ASTNode node : method.getBody()) {
            node.execute(localSymbolTable);
        }

        return localSymbolTable.get(MethodDeclaration.RETURN_VARIABLE_NAME);
    }
}
