import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int[] arr = {6,23,5,62,574,34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
        }

    }

}
