package org.example.ast;

import java.util.HashMap;
import java.util.Map;

public interface ASTNode {
    Object execute(Map<String, Object> symbolTable);
}
