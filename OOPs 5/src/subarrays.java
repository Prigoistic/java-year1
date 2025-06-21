import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class subarrays {
    public static void printAll(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            start(arr, start);
        }
    }

    private static void start(int[] arr, int start) {
        for (int end = start; end < arr.length; end++) {
            current(arr, start, end);
        }
    }

    private static void current(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i == end ? "" : ", "));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        printAll(arr);
    }
}