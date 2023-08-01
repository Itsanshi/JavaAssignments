public class Q2 {
    public static void conquer(int[] arr, int si, int mi , int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mi+1;
        int x=0;
        while(idx1<=mi && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mi){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]= arr[idx2++];
        }
        for(int i=0, j=si;j<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mi = si+(ei-si)/2;
        divide(arr,si,mi );
        divide(arr,mi+1,ei);
        conquer(arr,si,mi,ei);
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,0,1,2,0};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
