import java.util.Scanner;

public class prefixsumeven {
    public static int[] evencoun(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = (arr[0]%2==0 ? 1:0);
        for (int i=0;i< arr.length;i++){
            prefix[i] = prefix[i-1] + ((arr[i]%2==0) ? 1:0);
        }
        return prefix;

    }
    public static int count(int[] prefix,int start,int end){
        if(start==0){
            return prefix[end];
        }
        return prefix[end] - prefix[start-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


    }
}
