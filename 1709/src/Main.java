import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String oddNumbers = "";
        for (int i = 2; i <= num; i += 2) {
            oddNumbers += i + " ";
        }
        System.out.println(oddNumbers);
    }
}