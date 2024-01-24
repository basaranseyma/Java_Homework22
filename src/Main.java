import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10; // Find the digit at the units place
            sum += remainder; // Add it to the sum
            number /= 10; // Shift the number one place to the right
        }

        // Print the result
        System.out.println("Sum of digits: " + sum);
    }
}
