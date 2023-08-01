public class Q12 {
    public static int maxDistance(int[] arr) {
        int n = arr.length;
        int min_idx = 0;
        int max_diff = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[min_idx]) {
                min_idx = i;
            } else {
                int diff = i - min_idx;
                if (diff > max_diff) {
                    max_diff = diff;
                }
            }
        }
        return max_diff;
    }

    public static void main(String[] args) {
        int[] arr={4,6,8,9,10,23};
        System.out.println(maxDistance(arr));

    }
}
