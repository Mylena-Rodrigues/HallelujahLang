package ast;

import java.util.Map;

public class PackageDeclaration implements ASTNode {
    private String packageName;

    public PackageDeclaration(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        // Verifica se a método existe
        if (symbolTable.get(packageName) != null) {
            throw new RuntimeException("Pacote '" + packageName + "' já criado.");
        }
        // Adicionar o pacote à tabela de símbolos
        symbolTable.put("alma", packageName);

        // Retornar algo significativo para a execução do programa, se necessário
        return null;
    }

    public String getPackageName() {
        return packageName;
    }
}