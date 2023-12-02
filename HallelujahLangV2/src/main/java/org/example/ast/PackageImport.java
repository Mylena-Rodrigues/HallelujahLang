package org.example.ast;

import java.util.Map;

public class PackageImport implements ASTNode {
    private String packageName;

    public PackageImport(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se o pacote já foi declarado anteriormente
        if (symbolTable.get(packageName) == null) {
            throw new RuntimeException("Pacote '" + packageName + "' não foi declarado anteriormente.");
        }

        // Realiza a lógica de importação do pacote (se necessário)

        // Retornar algo significativo para a execução do programa, se necessário
        return null;
    }

    public String getPackageName() {
        return packageName;
    }
}
