package ast;

import java.util.Map;
import java.util.List;

public class If implements ASTNode {
    private ASTNode expression;
    private List<ASTNode> ifBody;
    private List<ASTNode> elseIfBody;
    private List<ASTNode> elseBody;

    public If(ASTNode expression, List<ASTNode> ifBody, List<ASTNode> elseIfBody, List<ASTNode> elseBody) {
        super();
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseIfBody = elseIfBody;
        this.elseBody = elseBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if ((boolean) expression.execute(symbolTable)) {
            for (ASTNode node : ifBody) {
                node.execute(symbolTable);
            }
            for (ASTNode node : elseIfBody) {
                node.execute(symbolTable);
            }
        } else {
            for (ASTNode node : elseBody) {
                node.execute(symbolTable);
            }
        }
        return null;
    }

}
