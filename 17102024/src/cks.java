import java.util.*;

public class cks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int m1 = sc.nextInt();
            for (int i = 0; i < m1; i++) {
                sc.nextInt();
                sc.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int m2 = sc.nextInt();
            for (int i = 0; i < m2; i++) {
                sc.nextInt();
                sc.nextInt();
            }

            int incomingA = 0, outgoingA = 0;
            int incomingB = 0, outgoingB = 0;

            for (int i : a) {
                if (i == 0) incomingA++;
                else outgoingA++;
            }

            for (int i : b) {
                if (i == 0) incomingB++;
                else outgoingB++;
            }

            if (incomingA == outgoingB && outgoingA == incomingB) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}