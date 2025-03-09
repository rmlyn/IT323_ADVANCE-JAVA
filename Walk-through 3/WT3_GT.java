
public class WT3_GT {
    public static void main(String[] args) {
        // Task 1: Create an array of 5 student grades and calculate the average
        int[] grades = {95, 94, 96, 80, 75};
        int sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / (double) grades.length;
        System.out.println("Average Grade: " + average);

        // Task 2: Find the maximum and minimum value in an array
        int max = grades[0];
        int min = grades[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);

        // Task 3: Reverse an array using a loop
        System.out.println("Reversed Array:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(grades[i]);
        }
    }
}