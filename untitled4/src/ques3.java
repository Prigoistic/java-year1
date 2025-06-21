import java.util.Scanner;

public class ques3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i<num;i++){
            arr[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i=0; i<num; i++){
            result ^= arr[i];
        }

        System.out.println(result);



    }

}
