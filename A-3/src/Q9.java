import java.util.NoSuchElementException;
import java.util.*;
public class Q9 {
        private int[] array;
        private int size;
        public Q9(int[] array) {
            this.array = array;
            mergeSort(array, 0, array.length - 1);
            this.size = array.length;
        }
        public int findMin() {
            if (size == 0) {
                throw new NoSuchElementException("List is empty");
            }
            return array[0];
        }
        public int findMax() {
            if (size == 0) {
                throw new NoSuchElementException("List is empty");
            }
            return array[size - 1];
        }
        public double findMedian() {
            if (size == 0) {
                throw new NoSuchElementException("List is empty");
            }
            int middle = size / 2;
            if (size % 2 == 0) {
                return (double)(array[middle-1] + array[middle]) / 2.0;
            } else {
                return (double)array[middle];
            }
        }

        private void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;
                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);
                merge(arr, left, middle, right);
            }
        }

        private void merge(int[] arr, int left, int middle, int right) {
            int[] leftArray = new int[middle - left + 1];
            int[] rightArray = new int[right - middle];

            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = arr[left + i];
            }

            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = arr[middle + 1 + i];
            }

            int i = 0, j = 0, k = left;
            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < leftArray.length) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < rightArray.length) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

            public static void main(String[] args) {
                int[] array = {5, 2, 9, 1, 7, 3};
                Q9 sortedList = new Q9(array);

                System.out.println("Sorted array: " + Arrays.toString(sortedList));
                System.out.println("Minimum element: " + sortedList.findMin());
                System.out.println("Maximum element: " + sortedList.findMax());
                System.out.println("Median element: " + sortedList.findMedian());
            }
        }




