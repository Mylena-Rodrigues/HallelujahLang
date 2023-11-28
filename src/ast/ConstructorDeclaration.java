package ast;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ConstructorDeclaration implements ASTNode {
    private List<Parameter> parameters;
    private List<ASTNode> constructorBody;

    public ConstructorDeclaration(List<Parameter> parameters, List<ASTNode> constructorBody) {
        this.parameters = parameters;
        this.constructorBody = constructorBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se já existe um construtor para a classe
        if (symbolTable.containsKey("constructor")) {
            throw new RuntimeException("Erro semântico: Construtor já declarado para a classe.");
        }

        // Adiciona o construtor ao escopo global da classe
        symbolTable.put("constructor", this);

        // Cria um novo escopo para o construtor
        Map<String, Object> constructorScope = new HashMap<>();

        // Adiciona os parâmetros do construtor ao escopo
        for (Parameter parameter : parameters) {
            parameter.execute(constructorScope);
        }

        // Executa o corpo do construtor
        for (ASTNode constructorNode : constructorBody) {
            constructorNode.execute(constructorScope);
        }

        System.out.println("Análise semântica concluída para o construtor da classe.");
        return null;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }
}
