import java.util.Scanner;

public class q3 {
    public static int[][] multiply(int[][] M1, int[][] M2) {
        int rowsA = M1.length;
        int clmsA = M1[0].length;
        int clmsB = M2[0].length;

        int[][] M3 = new int[rowsA][clmsB];


        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < clmsB; j++) {
                for (int k = 0; k < clmsA; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }

        return M3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");

        int rowsA = scanner.nextInt();
        System.out.println("Enter number of ColmsA");
        int colsA = scanner.nextInt();
        System.out.println("Enter number of ColmsB");
        int colsB = scanner.nextInt();

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[colsA][colsB];

        System.out.println("Elements of" + rowsA + "x" + colsA);

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of" + colsA + "x" + colsB);
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiply(A, B);
        System.out.println("Output: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}