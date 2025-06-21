public class Class3 {

    //given an array find the closest smallest element in the left side of the selected element is none foudn return -1

    public static int getClosestSmallest(int[] arr){
        int n = arr.length-1;
        int left = 0;
        int right = 1;

        for(int i = 0; i< n ;i++){
            if(arr[left] > arr[right]){
                return -1;
            }

            left++;
            right++;

        }








    }
    public static void main(String[] args) {

    }
}
