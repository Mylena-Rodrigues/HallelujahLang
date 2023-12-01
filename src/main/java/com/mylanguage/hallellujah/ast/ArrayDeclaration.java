package ast;

import java.util.List;
import java.util.Map;

public class ArrayDeclaration implements ASTNode {
    private String dataType;
    private String identifier;
    private ArrayInitializer initialization;

    public ArrayDeclaration(String dataType, String identifier, ArrayInitializer initialization) {
        this.dataType = dataType;
        this.identifier = identifier;
        this.initialization = initialization;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se o tipo do array é válido
        if (!tipoValido(dataType)) {
            throw new RuntimeException("Erro semântico: Tipo de dados inválido: " + dataType);
        }

        // Verifica se o identificador já foi declarado
        if (symbolTable.containsKey(identifier)) {
            throw new RuntimeException("Erro semântico: Identificador já declarado: " + identifier);
        }

        // Adiciona o identificador ao mapa de variáveis declaradas
        symbolTable.put(identifier, dataType);

        // Se houver inicialização, executa a análise semântica da inicialização
        if (initialization != null) {
            initialization.execute(symbolTable);
        }

        System.out.println("Análise semântica concluída para a declaração de array.");
        return null;
    }

    private boolean tipoValido(String tipo) {
        // Adapte conforme necessário com os tipos permitidos em sua linguagem
        return tipo.equals("INT") || tipo.equals("FLOAT") || tipo.equals("BOOLEAN") ||
                tipo.equals("STRING") || tipo.equals("VOID");
    }
}