import java.util.Scanner;
public class Q5 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rotation times: ");
        int k =sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=0;i<k;i++){
            int first = arr[0],j;
            for( j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    }

