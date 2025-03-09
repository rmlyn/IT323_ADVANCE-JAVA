
import java.util.Arrays;

public class WT4_GT {

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Linear Search Algorithm
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    // Binary Search Algorithm (assumes array is sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 12, 15, 9};

        // Bubble Sort
        int[] bubbleSortedArray = arr.clone();
        bubbleSort(bubbleSortedArray);
        System.out.print("Bubble Sorted Array: ");
        for (int num : bubbleSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Selection Sort
        int[] selectionSortedArray = arr.clone();
        selectionSort(selectionSortedArray);
        System.out.print("Selection Sorted Array: ");
        for (int num : selectionSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Linear Search
        int target = 9;
        int indexLinearSearch = linearSearch(arr, target);
        if (indexLinearSearch != -1) {
            System.out.println("Linear Search: Element " + target + " found at index " + indexLinearSearch);
        } else {
            System.out.println("Linear Search: Element " + target + " not found.");
        }

        // Binary Search (needs sorted array)
        int[] sortedArrayForBinarySearch = selectionSortedArray; 
        // Can use either bubbleSortedArray or selectionSortedArray
        int indexBinarySearch = binarySearch(sortedArrayForBinarySearch, target);
        if (indexBinarySearch != -1) {
            System.out.println("Binary Search: Element " + target + " found at index " + indexBinarySearch);
        } else {
            System.out.println("Binary Search: Element " + target + " not found.");
        }
    }
}