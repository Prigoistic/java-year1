import java.util.Arrays;
import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int colms = scanner.nextInt();
        int[][] mat = new int[rows][colms];
        for (int i=0;i<rows;i++){
            for (int j=0;j<colms;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        int target = scanner.nextInt();
        int ans[]= searc(mat,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searc(int[][] arr, int target){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{0} ;
    }
}
