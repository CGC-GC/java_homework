package PR20.entities;
import java.util.Stack;

public class CalculatorModel {
    private String expression = "";

    public void appendExpression(String input) {
        expression += input;
    }
    public void clearExpression() {
        expression = "";
    }
    public String getExpression() {
        return expression;
    }
    public double evaluateExpression() {
        try {
            return calculateRPN(expression);
        } catch (Exception ex) {
            return Double.NaN;
        }
    }
    private double calculateRPN(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (token.equals("+")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a / b);
            }
        }
        return stack.pop();
    }
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}