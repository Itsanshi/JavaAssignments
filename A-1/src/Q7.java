public class Q7 {
    public static void waveSort(int[] arr){
        for(int i=1;i<arr.length;i+=2){
            int temp =0;
            if(arr[i]>arr[i-1]){
                temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            if(arr[i]>arr[i+1] ){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,7,5,6,2};
        waveSort(arr);

    }
}
