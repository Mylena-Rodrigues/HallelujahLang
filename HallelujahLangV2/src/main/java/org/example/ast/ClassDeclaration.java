package org.example.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassDeclaration implements ASTNode {
    private String className;
    private List<ASTNode> classBody;

    public ClassDeclaration(String className, List<ASTNode> classBody) {
        this.className = className;
        this.classBody = classBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se a classe já foi declarada
        if (symbolTable.containsKey(className)) {
            throw new RuntimeException("Erro semântico: Classe já declarada: " + className);
        }

        // Cria um novo escopo para a classe
        Map<String, Object> classScope = new HashMap<>();

        // Adiciona a classe ao escopo global
        symbolTable.put(className, classScope);

        // Executa as declarações dentro da classe
        for (ASTNode classNode : classBody) {
            classNode.execute(classScope);
        }

        System.out.println("Análise semântica concluída para a declaração da classe: " + className);
        return null;
    }
}
