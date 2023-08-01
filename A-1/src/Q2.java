import java.util.Scanner;
public class Q2 {
    public static void decimalBinary(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i=0;
        int[] arr = new int[100];
        while(n!=0){
            arr[i] = n%2;
            n= n/2;
            i++;
        }
        System.out.println("Binary value is: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        decimalBinary();


    }
}
