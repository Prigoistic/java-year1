public class assigns {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Handling edge cases
        if (num <= 1) return false;

        // Check for divisibility
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }


    public static int countPrimeSumSubarrays(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            for (int end = start; end < n; end++) {
                // Add current element to sum
                currentSum += arr[end];

                // Check if sum is prime
                if (isPrime(currentSum)) {
                    count++;
                }
            }
        }

        return count;
    }

    // Approach 2: Optimized with Prefix Sum
    public static int countPrimeSumSubarraysOptimized(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Prefix sum array to store cumulative sums
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        // Calculate prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i-1];
        }

        // Check all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Calculate subarray sum using prefix sum
                int subarraySum = prefixSum[end + 1] - prefixSum[start];

                // Check if sum is prime
                if (isPrime(subarraySum)) {
                    count++;
                }
            }
        }

        return count;
    }


}