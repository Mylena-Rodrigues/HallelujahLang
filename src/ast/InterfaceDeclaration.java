package ast;

import java.util.List;
import java.util.Map;

public class InterfaceDeclaration implements ASTNode {
    private String interfaceName;
    private List<MethodDeclaration> methodDeclarations;

    public InterfaceDeclaration(String interfaceName, List<MethodDeclaration> methodDeclarations) {
        this.interfaceName = interfaceName;
        this.methodDeclarations = methodDeclarations;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verificar se a interface já foi declarada
        if (!symbolTable.containsKey(interfaceName)) {
            throw new RuntimeException("Interface '" + interfaceName + "' não foi declarada anteriormente.");
        }

        // Obter a declaração da interface na tabela de símbolos
        InterfaceDeclaration existingInterface = (InterfaceDeclaration) symbolTable.get(interfaceName);

        // Verificar os métodos declarados na interface
        for (MethodDeclaration method : methodDeclarations) {
            // Verificar se a assinatura do método na interface corresponde ao método
            // passado
            if (!existingInterface.isMethodSignatureCorrect(method)) {
                throw new RuntimeException("Assinatura do método '" + method.getName() + "' na interface '"
                        + interfaceName + "' não corresponde à declaração.");
            }
        }

        // A execução da interface está correta
        return null; // Ou retorne algo significativo para a execução do programa
    }

    // Verifica se a assinatura do método na interface corresponde ao método passado
    private boolean isMethodSignatureCorrect(MethodDeclaration method) {
        for (MethodDeclaration existingMethod : methodDeclarations) {
            if (existingMethod.getName().equals(method.getName())
                    && existingMethod.getType().equals(method.getType())
                    && existingMethod.getParameterTypes().equals(method.getParameterTypes())) {
                // Comparação de assinatura: nome, tipo de retorno e lista de parâmetros
                return true; // A assinatura do método corresponde à interface existente
            }
        }
        return false; // A assinatura do método não corresponde à interface existente
    }

    // Verifica se o método está presente na interface existente
    private boolean containsMethod(MethodDeclaration method) {
        for (MethodDeclaration existingMethod : methodDeclarations) {
            if (existingMethod.getName().equals(method.getName())) {
                return true; // O método está presente na interface existente
            }
        }
        return false; // O método não está presente na interface existente
    }
}
