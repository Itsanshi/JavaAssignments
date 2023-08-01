public class Q11 {
    public static void maxSum(int[] arr){
        int maxSum=0;
        int currSum=0;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
            currSum += i*arr[i];
        }maxSum =currSum;
        for(int i=0;i<arr.length;i++){
            currSum = currSum +totalSum - arr.length* arr[arr.length-1];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr ={4,3,6,8,2,7};
        maxSum(arr);

    }
}
