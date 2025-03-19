import java.util.Scanner;
//
public class allaboutsubarrays {
//    public static void printallarrays(int[] arr){
//        for(int start = 0; start< arr.length;start++){
//            for(int end = start; end< arr.length;end++){
//                printsubarray(arr,start,end);
//            }
//        }
//    }
//
//    private static void printsubarray(int[] arr, int start, int end) {
//        System.out.println("[");
//        for (int i =start; i<end; i++){
//            System.out.println(arr[i] + (i==end ? "" : ","));
//        }
//        System.out.println("]");
//    }
//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        sum(arr);
    }

//    public int numberofSubarrayswithPrimesum(int[] A){
//        int count = 0;
//        for (int start = 0;start<A.length;start++){
//            int currentsum = 0;
//            for (int end = start; end<A.length;end++){
//                currentsum+= A[end];
//                if (isPrime(currentsum));
//            }
//        }
//        return count;
//    }
//
//    private boolean isPrime(int currentsum) {
//        if (currentsum<=1){
//            return false;
//        }
//        for (int i=2; i<=Math.sqrt(currentsum);i++){
//            if (currentsum%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void sum(int[] arr){

        for(int start = 0; start< arr.length;start++){
            int cumsum = 0;
            for(int end = start; end<arr.length;end++){
                cumsum += arr[end];
                System.out.println(cumsum+ " ");

                
            }
        }
        System.out.println();
    }
}

