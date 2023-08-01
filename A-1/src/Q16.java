public class Q16 {
    public static void permutation(int[] arr, int fi){
        if(fi==arr.length-1){
            return;
        }
        for(int i=0;i<arr.length;i++){
            swap(arr,i,fi);
            permutation(arr, fi+1);
            swap(arr,i,fi);
        }
    }
    public static void swap(int[] arr,int i ,int fi){
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi]= temp;
    }
    public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            permutation(arr,0);

        }
    }


