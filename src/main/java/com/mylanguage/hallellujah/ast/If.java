package ast;

import java.util.Map;
import java.util.List;

public class If implements ASTNode {
    private ASTNode expression;
    private List<ASTNode> ifBody;
    private ASTNode elseIfExpression;
    private List<ASTNode> elseIfBody;
    private List<ASTNode> elseBody;

    public If(ASTNode expression, List<ASTNode> ifBody, ASTNode elseIfExpression, List<ASTNode> elseIfBody,
            List<ASTNode> elseBody) {
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseIfExpression = elseIfExpression;
        this.elseIfBody = elseIfBody;
        this.elseBody = elseBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if ((boolean) expression.execute(symbolTable)) {
            if (ifBody != null) {
                for (ASTNode node : ifBody) {
                    node.execute(symbolTable);
                }
            }
        } else if ((boolean) elseIfExpression.execute(symbolTable)) {
            if (elseIfBody != null) {
                for (ASTNode node : elseIfBody) {
                    node.execute(symbolTable);
                }
            }
        } else {
            if (elseBody != null) {
                for (ASTNode node : elseBody) {
                    node.execute(symbolTable);
                }
            }
        }
        return null;
    }
}