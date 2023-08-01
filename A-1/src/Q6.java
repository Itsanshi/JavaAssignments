public class Q6 {
    public static void maxSumSubarray(int[] arr){
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            currSum = currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr={5, -4, -2 , 6 , -1};
        maxSumSubarray(arr);

    }
}
