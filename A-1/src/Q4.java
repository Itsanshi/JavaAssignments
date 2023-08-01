public class Q4 {
    public static void main(String[] args) {
            int[] arr={5,7,9,10,12,18,23};
            int key=12;
            int li=0;
            int hi=arr.length-1;
            int mi=(li+hi)/2;
            while(li<=hi){
                if(arr[mi]==key){
                    System.out.println(key+" is at "+mi+" index position");
                    break;
                }
                else if(arr[mi]<key){
                    li=mi+1;
                }
                else{
                    hi=mi-1;
                }
                mi=(li+hi)/2;
            }
            if(li>hi){
                System.out.println("Item not found");
            }


        }
        }




