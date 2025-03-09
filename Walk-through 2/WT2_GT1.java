import java.util.Scanner;
public class WT2_GT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if a number is even or odd
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The number " + number + (number % 2 == 0 ? " is even." : " is odd."));
        
        // Display the name of the day based on input
        System.out.println(" Guided_task 1:");
        
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int dayNumber = scanner.nextInt();
        String day;
        switch (dayNumber) {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default: day = "Invalid input! Please enter a number between 1 and 7."; break;
        }
        System.out.println(day);
        
        // Print numbers from 10 to 1
        System.out.println("Guided_task2: ");
        
        System.out.println(" Counting down from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Number: " + i);
        }

        scanner.close();
    }

    }
    
