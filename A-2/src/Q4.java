import java.util.Stack;
public class Q4 {
    public static int evaluatePostfixExpression(String expression) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(operand1 + operand2);
                            break;
                        case '-':
                            stack.push(operand1 - operand2);
                            break;
                        case '*':
                            stack.push(operand1 * operand2);
                            break;
                        case '/':
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }

            return stack.pop();
        }

        public static void main(String[] args) {
            String postfix = "23+45-*";
            int result = evaluatePostfixExpression(postfix);
            System.out.println("Result: " + result);
        }
    }


