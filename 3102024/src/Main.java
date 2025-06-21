import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i<t; i++){
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j<n; j++){
                arr[j] = scanner.nextInt();

            }
            Arrays.sort(arr);

            int count = 1;
            for (int j =1;j<n;j++){
                if (arr[j]!=arr[j-1]){
                    if (count==1){
                        System.out.println(arr[j-1]);
                    }
                    count =1;

                } else {
                    count++;
                }
            }
        }

               }


    }
