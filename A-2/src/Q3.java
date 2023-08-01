import java.util.Stack;
public class Q3 {
    public static void main(String[] args) {
        int num = 10;
        System.out.print("Decimal " + num );
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            int rem = num % 2;
            stack.push(rem);
            num /= 2;
        }
        String binary = "";
        while(!stack.isEmpty()){
         binary += stack.pop();
        }
         System.out.println( " is equivalent to binary "+binary);
        }
    }



