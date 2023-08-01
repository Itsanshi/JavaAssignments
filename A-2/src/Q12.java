import java.util.*;
public class Q12 {
    public static void main(String[] args) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("John", 25);
                map.put("Mary", 30);
                map.put("Bob", 35);

                System.out.println("The HashMap contains:");
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
                }
            }
        }


