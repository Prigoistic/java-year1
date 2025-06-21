import java.util.*;

public class q4 {
    public static int Unique(int[] arr) {
        int n = arr.length;
        int moves = 0;


        Arrays.sort(arr);


        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                moves += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int moves = Unique(arr);
            System.out.println(moves);
        }
    }
}