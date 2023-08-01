import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(4);
        list1.add(8);
        list1.add(10);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);
        int result = list1.get(4);
        System.out.println(result);
        list1.add(2,3);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
            if(list1.isEmpty()){
                System.out.println("ArrayList is empty");
            }
            else{
                System.out.println("ArrayList is not empty");
            }
            int search = 10;
            if(list1.contains(search)){
                System.out.println("Number is present");
            }
            else{
                System.out.println("Number is not present");
            }
            System.out.println(list1.remove(3));
    }
}
