
import java.time.LocalDateTime;
	import java.util.Scanner;

	public class SELFPRAC_1 {
	    public static void main(String[] args) {
	        // Task 1: Take user input for name and age
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine(); 

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        System.out.println("Hello, " + name + "! You are " + age + " years old.");

	        // Task 2: Use LocalDateTime to print the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        System.out.println("Current Date and Time: " + currentDateTime);
	     
	        scanner.close();
	    }
	}