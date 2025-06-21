import java.util.Arrays;

public class searchingintwoDs {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}        };

        System.out.println(Arrays.toString(binary2d(arr, 4)));

    }

    static int[] binary2d(int[][] matrix, int target){
        int rows = 0;
        int colms = matrix.length-1;
        while ( rows< matrix.length && colms>=0){
            if (matrix[rows][colms]==target){
                return new int[]{rows,colms};
            }
            if (matrix[rows][colms] < target){
                rows++;
            }else{
                colms--;
            }

        }
        return new int[]{-1,-1};

    }
    static int[] binarysearch(int[][] matrix, int row, int start , int end , int target){
        while (start<=end){
            int mid = start + (end-start)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target) {
                start = mid+1;

            }else{
               end = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    //searching in a sorted 2D array
//    static int[] sortedsearch(int[][] matrix, int target){
//        int rows = matrix.length;
//        int colms = matrix[0].length-1;
//
//        if(rows ==1){
//            return binarysearch(matrix, 0,0,colms-1,target);
//        }
//
//    }

}
