import java.util.*;

public class insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[n];
            long totalCans = 0;

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLong();
                totalCans += a[j];
            }

            Arrays.sort(a);
            long presses = 0;
            long cansCollected = 0;

            for (int j = n - 1; j >= 0; j--) {
                if (cansCollected >= k) break;
                presses += a[j];
                cansCollected += 1;
            }

            if (cansCollected < k) {
                presses += (k - cansCollected);
            }

            result.append(presses).append("\n");
        }

        System.out.print(result);
        scanner.close();
    }
}
