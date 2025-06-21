import java.util.HashMap;

public class divisiblebylengthofarray {
    static boolean checkbylength(int[] arr, int n){
        if(arr == null){
            return false;

        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i< arr.length;i++){
            sum = sum + arr[i];

            if(n!=0){
                sum = sum%n;
            }

            if (map.containsKey(sum)){
                return true;
            }else {
                map.put(sum,i);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println(checkbylength(arr,n));
    }

}
