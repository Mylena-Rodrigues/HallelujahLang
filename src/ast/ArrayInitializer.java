package ast;

import java.util.List;
import java.util.Map;

public class ArrayInitializer implements ASTNode {
    private String dataType;
    private List<ASTNode> elements;

    public ArrayInitializer(String dataType, List<ASTNode> elements) {
        this.dataType = dataType;
        this.elements = elements;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        // Verifica se o tipo do array é válido
        if (!tipoValido(dataType)) {
            throw new RuntimeException("Erro semântico: Tipo de dados inválido: " + dataType);
        }

        // Verifica se os elementos correspondem ao tipo declarado do array
        for (ASTNode element : elements) {
            Object elementValue = element.execute(symbolTable);
            if (!tipoCorrespondente(elementValue, dataType)) {
                throw new RuntimeException("Erro semântico: Tipo de inicializador não corresponde ao tipo declarado");
            }
        }

        System.out.println("Análise semântica concluída para a inicialização de array.");
        return null;
    }

    private boolean tipoValido(String tipo) {
        // Adapte conforme necessário com os tipos permitidos em sua linguagem
        return tipo.equals("pes") || tipo.equals("asas") || tipo.equals("consciencia") ||
                tipo.equals("gloria") || tipo.equals("qualquer");
    }

    private boolean tipoCorrespondente(Object elemento, String tipo) {
        // Verifica se o tipo do inicializador corresponde ao tipo declarado
        if (tipo.equals("pes") && elemento instanceof Integer) {
            return true;
        } else if (tipo.equals("asas") && elemento instanceof Float) {
            return true;
        } else if (tipo.equals("consciencia") && elemento instanceof Boolean) {
            return true;
        } else if (tipo.equals("gloria") && elemento instanceof String) {
            return true;
        } else if (tipo.equals("qualquer") && elemento instanceof Void) {
            return true;
        } else {
            return false;
        }
    }
}