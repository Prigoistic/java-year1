class Bit {
    public static int totalHammingDistance(int[] nums) {
        int total_sum = 0;
        int n = nums.length;

        for (int i = 0; i < 31; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int num : nums) {
                if ((num & (1 << i)) == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }
            total_sum += count0 * count1;
        }
        return total_sum;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        System.out.println(totalHammingDistance(arr));
    }
}
