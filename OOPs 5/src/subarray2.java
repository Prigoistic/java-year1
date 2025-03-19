import java.util.Scanner;

public class subarray2 {
    public static void printallarryas(int[] arr){
        for (int start=0;start< arr.length;start ++){
            for(int end=start; end< arr.length;end++){
                printsubarray(arr,start,end);
            }
        }
    }

    private static void printsubarray(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i=start;i<=end;i++){
            System.out.print(arr[i] + (i==end ? "" : ","));
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

        printallarryas(arr);

    }
}
