package org.example.ast;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MethodDeclaration implements ASTNode {
    public static final String RETURN_VARIABLE_NAME = "RETURN";

    private String methodType;
    private String methodName;
    private List<Parameter> parameterTypes; // Adicionando a lista de tipos dos parâmetros
    private List<ASTNode> body;
    private HashMap<String, Object> localSymbolTable;
    public MethodDeclaration(String type, String methodName, List<Parameter> parameterTypes,
                             List<ASTNode> body,
                             HashMap<String, Object> localSymbolTable) {
        this.methodType = type;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(methodName, this); // Adiciona a função à tabela de símbolos

        // Executa o corpo da função
        for (ASTNode node : body) {
            node.execute(localSymbolTable);
        }

        Object returnValue = localSymbolTable.getOrDefault(RETURN_VARIABLE_NAME, null);

        if (!isTypeMatch(returnValue)) {
            throw new RuntimeException("Tipo de retorno incompatível para o método '" + methodName + "'.");
        }

        return returnValue;
    }

    public String getType() {
        return methodType;
    }

    public String getName() {
        return methodName;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public HashMap<String, Object> getLocalSymbolTable() {
        return localSymbolTable;
    }

    // Método para acessar os tipos dos parâmetros
    public List<Parameter> getParameterTypes() {
        return parameterTypes;
    }

    private boolean isTypeMatch(Object returnValue) {
        if (methodType.equals("pes")) {
            return returnValue instanceof Integer;
        } else if (methodType.equals("asas")) {
            return returnValue instanceof Float;
        } else if (methodType.equals("consciencia")) {
            return returnValue instanceof Boolean;
        } else if (methodType.equals("gloria")) {
            return returnValue instanceof String;
        } else if (methodType.equals("nulo")) {
            return returnValue == null;
        } else {
            // Se o tipo não for um dos tipos suportados, não assume compatibilidade
            return false;
        }
    }
}
