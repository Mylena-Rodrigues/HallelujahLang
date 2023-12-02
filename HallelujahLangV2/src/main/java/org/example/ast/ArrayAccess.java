package org.example.ast;

import java.util.HashMap;
import java.util.Map;

public class ArrayAccess implements ASTNode {
    private String identifier;
    private ASTNode index;

    public ArrayAccess(String identifier, ASTNode index) {
        this.identifier = identifier;
        this.index = index;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se o array foi declarado anteriormente
        if (!symbolTable.containsKey(identifier)) {
            throw new RuntimeException("Erro semântico: Array não declarado: " + identifier);
        }

        // Executa a análise semântica do índice de acesso
        Object indexValue = index.execute(symbolTable);

        // Verifica se o índice é do tipo inteiro
        if (!(indexValue instanceof Integer)) {
            throw new RuntimeException("Erro semântico: O índice de acesso do array deve ser do tipo inteiro.");
        }

        System.out.println("Análise semântica concluída para a chamada do array.");
        return null;
    }
}
