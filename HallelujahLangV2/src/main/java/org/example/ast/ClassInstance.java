package org.example.ast;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ClassInstance implements ASTNode {
    private String className;
    private List<ASTNode> arguments;

    public ClassInstance(String className, List<ASTNode> arguments) {
        this.className = className;
        this.arguments = arguments;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se a classe foi declarada
        if (!symbolTable.containsKey(className)) {
            throw new RuntimeException("Erro semântico: Classe '" + className + "' não declarada.");
        }

        // Obtém o construtor da classe
        ConstructorDeclaration constructor = (ConstructorDeclaration) ((Map<String, Object>) symbolTable.get(className))
                .get("constructor");

        // Verifica se a quantidade de argumentos coincide com a quantidade de
        // parâmetros do construtor
        if (arguments.size() != constructor.getParameters().size()) {
            throw new RuntimeException("Erro semântico: Quantidade incorreta de argumentos na instanciação da classe '"
                    + className + "'.");
        }

        // Cria um novo escopo para a instância da classe
        Map<String, Object> instanceScope = new HashMap<>();

        // Adiciona os argumentos ao escopo
        for (int i = 0; i < arguments.size(); i++) {
            Parameter parameter = constructor.getParameters().get(i);
            ASTNode argument = arguments.get(i);
            instanceScope.put(parameter.getName(), argument.execute(symbolTable));
        }

        // Executa o construtor no escopo da instância
        constructor.execute(instanceScope);

        System.out.println("Análise semântica concluída para a instância da classe '" + className + "'.");
        return null;
    }
}