package ast;

import java.util.Map;

public class VariableDeclaration implements ASTNode {

    private String name;
    private String type;
    private ASTNode value;

    public VariableDeclaration(String name, String type, ASTNode value) {
        this.name = name;
        this.type = type;
        this.value = value;

    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se a variável já está na tabela de símbolos
        if (symbolTable.containsKey(name)) {
            throw new RuntimeException("Variable '" + name + "' already declared.");
        }

        // Adiciona a variável à tabela de símbolos com um valor inicial nulo
        if (value == null) {
            symbolTable.put(name, null);

            return null;
        } else {
            Object result = value.execute(symbolTable);

            // Verifica se o tipo do valor é o mesmo que o tipo da variável
            if (!isTypeMatch(result)) {
                throw new RuntimeException(
                        "Tipo do valor atribuído não corresponde ao tipo da variavel '" + name + "'.");
            }

            // Atribui o valor à variável
            symbolTable.put(name, result);

            return result;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isTypeMatch(Object result) {
        // Verifica se o tipo do valor é o mesmo que o tipo declarado para a variável
        // Comparação de tipos de variáveis simples (int, float, boolean)

        if (type.equals("pes")) {
            return result instanceof Integer;
        } else if (type.equals("asas")) {
            return result instanceof Float;
        } else if (type.equals("consciencia")) {
            return result instanceof Boolean;
        } else if (type.equals("gloria")) {
            return result instanceof String;
        } else if (type.equals("nulo")) {
            return result == null;
        } else {
            // Se o tipo não for um dos tipos suportados, não assume compatibilidade
            return false;
        }
    }

}