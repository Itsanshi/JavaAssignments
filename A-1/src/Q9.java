public class Q9 {
    public static void smallestMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i]-1] != arr[i]) {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1) {
                System.out.println(i+1);
            }
        }
        System.out.println(n+1);
    }

    public static void main(String[] args) {
        int[] arr= {3, 1, -1 , 4 , 2 , 5 , 7};
        smallestMissingPositive( arr);
    }
}
