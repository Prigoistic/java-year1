import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int maxStep = 5;
        int steps = (x + maxStep - 1) / maxStep;


        System.out.println(steps);

        scanner.close();
    }
}