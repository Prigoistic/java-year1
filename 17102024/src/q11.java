import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        int smallerCount = 0;
        int greaterCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < average) {
                smallerCount++;
            } else if (arr[i] > average) {
                greaterCount++;
            }else if (arr[i]==-1){
                break;
            }
        }

        System.out.println(average);
        System.out.println(smallerCount);
        System.out.println(greaterCount);
    }
}