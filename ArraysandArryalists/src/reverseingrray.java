import java.util.Arrays;
import java.util.Scanner;

public class reverseingrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }

    static void reverse(int[] matrix) {
        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            swap(matrix, start, end);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
