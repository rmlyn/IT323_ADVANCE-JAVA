
public class WT3_SP1 {
    public static void main(String[] args) {
        // Two arrays to merge
        int[] array1 = {88, 97, 15, 20};
        int[] array2 = {25, 30, 65, 40};

        // Creating a new array to hold the merged values
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.println(num);
        }
    }
}