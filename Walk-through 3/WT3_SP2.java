
public class WT3_SP2 {
    public static void main(String[] args) {
        // Original array with duplicates
        int[] array = {55, 55, 78, 99, 99, 90, 80, 80, 50};

        // New array to store unique elements
        int[] uniqueArray = new int[array.length];
        int uniqueCount = 0;

        // Loop through the original array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the uniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueArray[i]);
        }
    }
}