import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }



            for (int j = 0; j < n; j++) {
                if (arr[j] % 2 != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();


            for (int j = 0; j < n; j++) {
                if (arr[j] % 2 == 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}