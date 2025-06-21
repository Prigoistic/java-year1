import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int sushilWealth = A[N - 1];
            int position = N - 1;

            for (int i = N - 2; i >= 0; i--) {
                if (A[i] <= sushilWealth / 2) {
                    position--;
                } else {
                    break;
                }
            }

            System.out.println(position + 1);
        }

        sc.close();
    }
}
