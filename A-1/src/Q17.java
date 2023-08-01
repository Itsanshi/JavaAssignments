public class Q17 {
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // target not found
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid; // target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // search in right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // search in left half
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int index = binarySearchRecursive(arr, target, 0, arr.length - 1);

        if (index == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Target value found at index " + index);
        }
    }
}
