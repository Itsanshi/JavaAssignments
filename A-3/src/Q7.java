public class Q7 {
    public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7, 9, 11};
            int[] arr2 = {2, 4, 6, 8, 10, 12};
            sortArrays(arr1, arr2);
            System.out.println("First array:");
            printArray(arr1);
            System.out.println("Second array:");
            printArray(arr2);
    }
    public static void sortArrays(int[] arr1, int[] arr2) {
            int n = arr1.length;
            for (int gap = nextGap(n); gap > 0; gap = nextGap(gap)) {
                for (int i = 0; i + gap < n; i++) {
                    int j = i + gap;
                    if (arr1[i] > arr1[j]) {
                        swap(arr1, i, j);
                    }
                    if (i < n / 2 && j >= n / 2) {
                        if (arr1[i] > arr2[j - n / 2]) {
                            swap(arr1, i, j - n / 2);
                            if (arr2[j - n / 2] > arr1[j]) {
                                swap(arr2, j - n / 2, j);
                            }
                        }
                    } else if (i >= n / 2 && j < n) {
                        if (arr2[i - n / 2] > arr1[j]) {
                            swap(arr2, i - n / 2, j);
                            if (arr1[i] > arr2[i - n / 2]) {
                                swap(arr1, i, i - n / 2);
                            }
                        }
                    } else if (i >= n / 2 && j >= n / 2) {
                        if (arr2[i - n / 2] > arr2[j - n / 2]) {
                            swap(arr2, i - n / 2, j - n / 2);
                        }
                    }
                }
            }
        }

        public static int nextGap(int gap) {
            if (gap <= 1) {
                return 0;
            }
            return (gap / 2) + (gap % 2);
        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

