import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int [][] arr = new int [num1][num2];
        for (int i =0; i<num1;i++){
            for (int j=0; j<num2;j++){
                arr[i][j] = scanner.nextInt();
            }

        System.out.println(Arrays.deepToString(arr));
    }
}}

