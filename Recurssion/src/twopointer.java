public class twopointer {
    public static boolean isExists(int[] arr, int k){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            int diff = arr[start] - arr[end];

            if ( diff == k){
                return true;
            } else if (diff > k) {
                end++;

            }else{
                start++;
            }
        }
        return false;

//        for(int i=0;i<n;i++){
//            for(int j = i+1 ; j<n ; j++){
//                if(arr[i] - arr[j] == k && i!=j){
//                    return true;
//                }
//            }
//        }
//
//        return false;


    }

    public static void main(String[] args) {
        int[] arr = {-3,0,1,3,6,8,11,14,21,25};
        int k = 5;
        boolean check = isExists( arr, k);
        System.out.println(check);

    }

}
