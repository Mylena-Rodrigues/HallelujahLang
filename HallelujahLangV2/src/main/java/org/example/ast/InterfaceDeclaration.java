package org.example.ast;

import java.util.List;
import java.util.Map;

public class InterfaceDeclaration implements ASTNode {
    private String interfaceName;
    private List<ASTNode> body;
    private Map<String, Object> localSymbolTable;

    public InterfaceDeclaration(String interfaceName, List<ASTNode> body, Map<String, Object> localSymbolTable) {
        this.interfaceName = interfaceName;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verificar se a interface já foi declarada
        if (!symbolTable.containsKey(interfaceName)) {
            throw new RuntimeException("Interface '" + interfaceName + "' não foi declarada anteriormente.");
        }

        // Executa o corpo da interface
        for (ASTNode node : body) {
            node.execute(localSymbolTable);
        }

        // Obter a declaração da interface na tabela de símbolos
        InterfaceDeclaration existingInterface = (InterfaceDeclaration) symbolTable.get(interfaceName);

        if (existingInterface != null) {
            throw new RuntimeException("Interface '" + interfaceName + "' já existe");
        }

        // A execução da interface está correta
        return null; // Ou retorne algo significativo para a execução do programa
    }
}
