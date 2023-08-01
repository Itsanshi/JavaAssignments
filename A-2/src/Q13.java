import java.util.*;
public class Q13 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of elements: ");
                int N = scanner.nextInt();
                HashSet<Integer> set = new HashSet<>();
                System.out.println("Enter the elements:");
                for (int i = 0; i < N; i++) {
                    int num = scanner.nextInt();
                    set.add(num);
                }
                System.out.print("The unique elements are:");
                for (int num : set) {
                    System.out.print(num +" ");
                }
            }
        }

