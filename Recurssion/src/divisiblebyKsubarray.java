import java.util.HashMap;

public class divisiblebyKsubarray {
    public static boolean checkSum(int[] nums, int k) {
        if (nums == null) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (k != 0) {
                sum = sum % k;
            }
            if (map.containsKey(sum)) {
                return true;

            }else {
                map.put(sum, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,-2,6,2,1,2,5,8,-1};
        int k = 10;
        System.out.println(checkSum(arr, 10));
    }
}
