import java.util.*;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] games = new double[n][2];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int w = sc.nextInt();
            games[i][0] = p;
            games[i][1] = w;
        }

        double maxExpectedValue = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            double totalProbability = 1;
            double totalWinnings = 0;

            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) > 0) {
                    totalProbability *= (games[j][0] / 100);
                    totalWinnings += games[j][1];
                }
            }

            double expectedValue = totalProbability * totalWinnings;
            maxExpectedValue = Math.max(maxExpectedValue, expectedValue);
        }

        System.out.printf("%.10f\n", maxExpectedValue);

        sc.close();
    }
}