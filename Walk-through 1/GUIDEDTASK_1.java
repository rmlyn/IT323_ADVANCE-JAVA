import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class GUIDEDTASK_1 {
    public static void main(String[] args) {
        
        // Step 1: Create a variable to hold your name and display a greeting
        String userName = "Romelyn"; 
        System.out.println("Hi, " + userName + "! Good Morning! " + "Mabuhay!");
        
        // Step 2: Compute the area of a rectangle (length × width)
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        double rectangleLength = inputScanner.nextDouble();

        System.out.print("Please enter the width: ");
        double rectangleWidth = inputScanner.nextDouble();

        // Calculate the area
        double rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The area of the rectangle is: " + rectangleArea);

        inputScanner.close();

        // Step 3: Display the current date and time
        LocalDate todayDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        System.out.println("Today's Date: " + todayDate);
        System.out.println("Current Time: " + nowTime);
    }
}