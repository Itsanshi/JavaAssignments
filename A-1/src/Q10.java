import java.util.Arrays;
public class Q10 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int[] result = rearrangeSortedArray(arr);
            System.out.println(Arrays.toString(result));
        }

        public static int[] rearrangeSortedArray(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            int start = 0, end = n-1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    result[i] = arr[end];
                    end--;
                } else {
                    result[i] = arr[start];
                    start++;
                }
            }

            return result;
        }
    }


