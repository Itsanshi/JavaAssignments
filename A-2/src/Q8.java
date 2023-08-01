import java.util.*;
class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String getAddress() {
        return plotNo + ", " + at + ", " + post;
    }
}
public class Q8 {
        public static void main(String[] args) {

            TreeMap<String, Address> addressMap = new TreeMap<>();

            Address address1 = new Address(101, "Main Road", "Mumbai");
            Address address2 = new Address(102, "Park Street", "Kolkata");
            Address address3 = new Address(103, "MG Road", "Bangalore");

            addressMap.put("John", address1);
            addressMap.put("Mary", address2);
            addressMap.put("Bob", address3);

            for (Map.Entry<String, Address> entry : addressMap.entrySet()) {
                System.out.println(entry.getKey() + " lives at " + entry.getValue().getAddress());
            }
        }
    }
