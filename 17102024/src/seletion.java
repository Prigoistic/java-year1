import java.util.Scanner;

public class seletion {
    public static void sort(int[] matrix){
        int n = matrix.length;
        for (int i=0;i<n-1;i++){
            int minIndex = i;
            for (int j =i+1;j<n;j++){
                if (matrix[j]<matrix[minIndex]){
                    minIndex=j;
                }
            }
            int temp  = matrix[minIndex];
            matrix[minIndex] =  matrix[i];
            matrix[i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        for (int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}
