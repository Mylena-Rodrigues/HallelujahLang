package org.example.ast;

import java.util.Map;
import java.util.List;

public class WhileLoop implements ASTNode {
    private List<ASTNode> whileBody;
    private ASTNode expression;

    public WhileLoop(ASTNode expression, List<ASTNode> whileBody) {
        super();
        this.expression = expression;
        this.whileBody = whileBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        while ((boolean) expression.execute(symbolTable)) {
            for (ASTNode node : whileBody) {
                node.execute(symbolTable);
            }
        }
        return null;
    }

}
