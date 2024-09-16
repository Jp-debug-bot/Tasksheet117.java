import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter three numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            // Determine the largest number
            int largest;
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
            
            // Print the largest number
            System.out.println("The largest number is: " + largest);
        }
        
        // Close the scanner
        scanner.close();
    }
}
