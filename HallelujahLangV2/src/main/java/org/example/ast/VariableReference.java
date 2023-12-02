package org.example.ast;

import java.util.Map;

public class VariableReference implements ASTNode {

    private String varName;

    public VariableReference(String varName) {
        this.varName = varName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(varName)) {
            return symbolTable.get(varName);
        } else {
            throw new RuntimeException("Variável não encontrada: " + varName);
        }
    }
}
