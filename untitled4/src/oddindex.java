import java.util.Scanner;

public class oddindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the number of elements

        int[] arr = new int[n]; // Create an array to store the numbers

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the elements at odd indices
        for (int i = 0; i < n; i += 2) {
            System.out.println(arr[i]);
        }
    }
}