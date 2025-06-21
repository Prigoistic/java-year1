public class orderagnostic {
    public static void main(String[] args) {
        int[] arr = {41,23,13,4,2};
        int target = 23;
        System.out.println(order(arr,target));

    }
    static int order(int[] arr,int target){
        int startcheck = arr[0];
        int endcheck = arr[arr.length-1];
        int startindex = 0;
        int endindex = arr.length-1;
        if (startcheck>endcheck){
            // 9 8 7 6 5 4 3
            while (startindex<=endindex){
                int mid = startindex + (endindex-startindex)/2;
                if (target>arr[mid]){
                    endindex = mid-1;

                } else if (target<arr[mid]) {
                    startindex = mid+1;

                }else {
                    return mid;

                }
            }

        } else if (endcheck>startcheck) {
            // 1 2 3 4 5 6 7 8 9
            while (startindex<=endindex){
                int mid = startindex + (endindex-startindex)/2;
                if (target>arr[mid]){
                    startindex = mid+1;

                } else if (target<arr[mid]) {
                    endindex = mid-1;

                }else {
                    return mid;

                }
            }

        }
        return -1;
    }
}
