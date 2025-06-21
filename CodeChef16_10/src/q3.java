import java.util.Scanner;

public class q3 {
    public static int Oddsum(int[] A) {
        int count = 0;
        int sum = 0;


        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] A = new int[n];

            for (int j = 0; j < n; j++) {
                A[j] = scanner.nextInt();
            }

            int maxOddPrefixSums = Oddsum(A);
            System.out.println(maxOddPrefixSums);
        }
    }
}
