package org.example.ast;

import java.util.Map;

public class Constant implements ASTNode {

    private Object value;

    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return value;
    }

}
