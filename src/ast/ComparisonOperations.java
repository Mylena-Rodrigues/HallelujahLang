package ast;

import java.util.Map;

public class ComparisonOperations implements ASTNode {

    private ASTNode leftOperand;
    private ASTNode rightOperand;
    private String operator;

    public ComparisonOperations(ASTNode leftOperand, ASTNode rightOperand, String operator) {
        super();
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Object execute(Map<String, Object> symbolTable) {
        Object leftResult = leftOperand.execute(symbolTable);
        Object rightResult = rightOperand.execute(symbolTable);

        switch (operator) {
            case ">=":
                return greaterThanOrEqual(leftResult, rightResult);
            case ">":
                return greaterThan(leftResult, rightResult);
            case "<=":
                return lessThanOrEqual(leftResult, rightResult);
            case "<":
                return lessThan(leftResult, rightResult);
            default:
                throw new RuntimeException("Invalid comparison operator: " + operator);
        }
    }

    private boolean greaterThanOrEqual(Object left, Object right) {
        return isValidValue(left, right) && compare(left, right) >= 0;
    }

    private boolean greaterThan(Object left, Object right) {
        return isValidValue(left, right) && compare(left, right) > 0;
    }

    private boolean lessThanOrEqual(Object left, Object right) {
        return isValidValue(left, right) && compare(left, right) <= 0;
    }

    private boolean lessThan(Object left, Object right) {
        return isValidValue(left, right) && compare(left, right) < 0;
    }

    private int compare(Object left, Object right) {
        if (left instanceof Comparable<?> && right instanceof Comparable<?>) {
            Comparable<Object> leftComparable = (Comparable<Object>) left;
            Comparable<Object> rightComparable = (Comparable<Object>) right;
            return leftComparable.compareTo(rightComparable);
        } else {
            throw new RuntimeException("Objects are not comparable");
        }
    }

    private boolean isValidValue(Object left, Object right) {
        if (left == null && right == null) {
            return false;
        } else if (left == null || right == null) {
            return false;
        }

        return true;
    }
}
