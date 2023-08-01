public class Q4 {
    public static void main(String[] args) {
                int[] arr = {2, 4, 5, 3, 7, 8, 9, 10, 12};
                separateEvenOdd(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
    }
    public static void separateEvenOdd(int[] arr) {
                mergesort(arr, 0, arr.length - 1);
            }
            public static void mergesort(int[] arr, int low, int high) {
                if (low < high) {
                    int mid = (low + high) / 2;
                    mergesort(arr, low, mid);
                    mergesort(arr, mid + 1, high);
                    merge(arr, low, mid, high);
                }
            }

            public static void merge(int[] arr, int low, int mid, int high) {
                int[] temp = new int[arr.length];
                int i = low, j = mid + 1, k = low;
                while (i <= mid && j <= high) {


                }}}

