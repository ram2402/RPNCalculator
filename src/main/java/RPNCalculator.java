import java.util.Stack;

final class RPNCalculator {
    static int calculate(final String expression) {
        Stack<Double> stack = new Stack<>();
        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    Double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "^":
                    Double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                default:
                    stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop().intValue();

    }
}
