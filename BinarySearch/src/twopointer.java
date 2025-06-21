import java.util.Arrays;

public class twopointer {
    public static void main(String[] args) {
        int[] mat = {6,4,2, 11, 25, 36, 73};
        //2 4 6 11 25 36 73
        int target = 25;
        Arrays.sort(mat);

        System.out.println(searching(mat,target));


    }

    static int searching(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (target>arr[mid]){
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid -1;

            }else {
                count++;
                return mid;

            }

        }
        return -1;
//        int index = -1;
//        int middle = (int)Math.floor((arr.length)/2);
//        if  (target > arr[middle]) {
//            for (int i = middle+1; i < arr.length; i++) {
//                if (target == arr[i]) {
//                    index = i;
//
//                    return i;
//                }
//            }
//        } else if (target < arr[middle]) {
//            for (int i = 0; i < middle; i++) {
//                if (target == arr[i]) {
//                    return 69;
//                }
//            }
//
//        } else if (target == arr[middle]) {
//            return 420;
//
//        }
//        return 0;

    }
}



