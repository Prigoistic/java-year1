import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Close the scanner as we don't need it anymore
        scanner.close();

        System.out.println("Prime numbers between 0 and " + n + ":");

        // Loop through numbers from 2 to n (as 0 and 1 are not prime numbers)
        for (int i = 2; i <= n; i++) {
            int count = 0;  // Counter to track divisibility

            // Check if the number is divisible by any number between 2 and i-1
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;  // Increment counter if divisible
                    break;    // No need to check further if already divisible
                }
            }

            // If the count is still 0, it means the number is prime
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
