import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();


        if (x1 == x2) {

            int side = Math.abs(y2 - y1);
            System.out.println((x1 + side) + " " + y1 + " " + (x2 + side) + " " + y2);
        } else if (y1 == y2) {

            int side = Math.abs(x2 - x1);
            System.out.println(x1 + " " + (y1 + side) + " " + x2 + " " + (y2 + side));
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {

            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {

            System.out.println(-1);
        }

        scanner.close();
    }
}
