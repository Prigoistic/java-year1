import java.util.Scanner;

public class sumofsubarrays {

    public static void sumarrays(int[] arr, int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            int subArraySum = 0;
            for (int j = i; j < i + k; j++) {
                subArraySum += arr[j];
            }
            System.out.println( (i + k - 1) + subArraySum);
        }
    }


    public static void sumofsubarrays(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println((k - 1) + sum);


        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];

            System.out.println((i - k + 1) + sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        sumofsubarrays(arr,k);

    }





}