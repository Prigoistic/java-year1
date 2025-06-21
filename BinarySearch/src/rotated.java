public class rotated {

    public static int rotated(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        if (arr[start]<=arr[end]){
            return start;
        }

        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1)%n;

            if(arr[mid]<=arr[prev] && arr[mid]<= arr[next]){
                return mid;
            } else if (arr[mid]<=arr[end]) {
                end = mid-1;
            } else if (arr[start]<=arr[mid]) {
                start = mid +1;

            }

        }

            return -1;


    }

    public static void main(String[] args) {
        int[] arr = {11,12,13,14,2,5,6};
        System.out.println(rotated(arr));

    }
}
