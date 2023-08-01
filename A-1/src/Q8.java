import java.util.Arrays;
public class Q8 {
        public static int[] arrangeArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                while (arr[i] != i && arr[i] != -1) {
                    int temp = arr[arr[i]];
                    arr[arr[i]] = arr[i];
                    arr[i] = temp;
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] arr = {3, 4, -1, 0, 1, 2};
            int[] arrangedArr = arrangeArray(arr);
            System.out.println(Arrays.toString(arrangedArr));
        }

}
