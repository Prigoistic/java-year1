import java.util.Arrays;

public class insertionsorts {
//    public static void sort(int[] matrix){
//        for (int i =0 ; i<matrix.length;i++){
//            int key = matrix[i];
//            int j = i-1;
//            while (j>=0 && key<matrix[j]){
//                matrix[j+1] = matrix[j];
//                j = j-1;
//
//            }
//            matrix[j+1] = key;
//        }
//
//    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insert(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr, j,j-1);

                }else{
                    break;
                }
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
