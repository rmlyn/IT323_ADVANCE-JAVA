import java.util.Scanner;

public class WT4_SP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input for an integer array
        System.out.println("Enter the size of the integer array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the integer array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print original array
        System.out.print("Original Integer Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Insertion Sort for integer array
        insertionSort(arr);
        System.out.print("\nSorted Integer Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Accept user input for an array of strings
        scanner.nextLine();  // Consume the newline
        System.out.println("\nEnter the number of strings:");
        int stringCount = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        String[] strArr = new String[stringCount];
        System.out.println("Enter the strings:");
        for (int i = 0; i < stringCount; i++) {
            strArr[i] = scanner.nextLine();
        }

        // Insertion Sort for string array
        insertionSortStrings(strArr);
        System.out.println("\nSorted String Array:");
        for (String str : strArr) {
            System.out.println(str);
        }

        scanner.close();
    }

    // Insertion Sort for Integer Array
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Insertion Sort for String Array
    public static void insertionSortStrings(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}