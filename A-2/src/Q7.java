import java.util.TreeSet;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(4);
        System.out.println("TreeSet: "+treeSet);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search:");
        int num = sc.nextInt();
        if(treeSet.contains(num)){
            System.out.println(num+" is present in treeSet");
        }
        else{
            System.out.println(num+" is not present in treeSet");
        }

        System.out.println("Enter the number you want to remove");
        int rem = sc.nextInt();
        if(treeSet.remove(rem)){
            System.out.println(rem+" removed from TreeSet");
            System.out.println("Updated treeSet: "+treeSet);
        }
        else{
            System.out.println(rem+" is not present in treeSet");
        }

    }
}
