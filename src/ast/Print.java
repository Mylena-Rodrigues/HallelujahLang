package ast;

import java.util.Map;

public class Print implements ASTNode {
    private ASTNode expression;

    public Print(ASTNode expression) {
        super();
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        System.out.println(expression.execute(symbolTable));
        return null;
    }
}
