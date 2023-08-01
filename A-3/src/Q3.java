public class Q3 {
        public static int minSwaps(int[] arr, int x) {
            int n = arr.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < x) {
                    count++;
                }
            }
            int bad = 0;
            for (int i = 0; i < count; i++) {
                if (arr[i] >= x) {
                    bad++;
                }
            }
            int ans = bad;
            for (int i = 0, j = count; j < n; i++, j++) {
                if (arr[i] >= x) {
                    bad--;
                }
                if (arr[j] >= x) {
                    bad++;
                }
                ans = Math.min(ans, bad);
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] arr = {2, 7, 9, 5, 8, 7, 4};
            int x = 6;
            int swaps = minSwaps(arr, x);
            System.out.println("Minimum swaps required: " + swaps);
        }
}
