import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i=0; i<num; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[num-2]);





    }
}
