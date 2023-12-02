package org.example.ast;

import java.util.Map;

public class LogicalAnd implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public LogicalAnd(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (boolean) leftValue && (boolean) rightValue;
        } else {
            throw new RuntimeException("Operação lógica AND aplicada a tipos não booleanos");
        }
    }
}
