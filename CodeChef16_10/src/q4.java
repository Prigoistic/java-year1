import java.util.Scanner;
import java.util.Arrays;

public class q4 {
    public static int maxScore(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int minElement = A[0];
        int maxElement = A[n - 1];
        int minK = A[0];
        int maxK = A[K - 1];


        int score = minElement + maxElement + minK + maxK;

        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int K = scanner.nextInt();
            int[] A = new int[n];

            for (int j = 0; j < n; j++) {
                A[j] = scanner.nextInt();
            }

            int maxScore = maxScore(A, K);
            System.out.println(maxScore);
        }
    }
}