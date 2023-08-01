import java.util.Scanner;
public class Q3 {
    public static void reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev=0 ,rem;
        while(n!=0){
             rem=n%10;
            rev = rev*10+rem;
            n=n/10;

        }
        System.out.println("Reverse of the number : "+rev);
    }

    public static void main(String[] args) {

        reverseNumber();

    }
}
