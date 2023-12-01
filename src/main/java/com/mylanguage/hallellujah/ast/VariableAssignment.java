package ast;

import java.util.Map;

public class VariableAssignment implements ASTNode {
    private String name;
    private ASTNode value;

    public VariableAssignment(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se a variável está na tabela de símbolos
        if (!symbolTable.containsKey(name)) {
            throw new RuntimeException("Variavel '" + name + "' not declarada.");
        }

        VariableDeclaration declaration = (VariableDeclaration) symbolTable.get(name);

        // Avalia o valor da expressão à direita
        Object result = value.execute(symbolTable);

        if (declaration != null && result != null) {
            if (!declaration.isTypeMatch(result)) {
                throw new RuntimeException(
                        "Tipo do valor atribuído não corresponde ao tipo da variável '" + name + "'.");
            }
        }

        // Atribui o valor à variável
        symbolTable.put(name, result);

        return result;
    }

    public String getName() {
        return name;
    }

    public ASTNode getValue() {
        return value;
    }
}
