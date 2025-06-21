import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored: ");
        int n = scanner.nextInt();
        int sum=0;
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();


        }
        System.out.println();

        for (int element : arr){
            if(element<0){
                System.out.println(element + " ");

            }



        }
        System.out.println(sum);


    }
}
