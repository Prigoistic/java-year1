public class sortung {
    public static void bubble(int[] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (matrix[j]<matrix[j+1]){
                    int temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    }

    public static void Insertion(int[] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && key<arr[j]){
                arr[j] = arr[j+1];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void Selection(int[] A){
        int n = A.length;
        for (int i=0;i<n;i++){
            int MinIndex = i;
            for (int j=i+1;j<n;j++){
                if (A[j]<A[i]){
                    MinIndex = j;
                }
            }
            int temp = A[MinIndex];
            A[MinIndex] = A[i];
            A[i] = temp;
        }
    }
}
