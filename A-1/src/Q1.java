import java.util.Scanner;
public class Q1 {
    public static void primeCheck(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        for(int i=2; i<n;i++){
            if(n%i==0){
                temp=temp+1;
            }
            if(temp>0){
                System.out.println(n+ " is not prime");
            }
            else{
                System.out.println(n+ " is prime");
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        primeCheck();



    }
}
