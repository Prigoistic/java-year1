import java.util.Scanner;

public class findingelementinssortedrotatedarray {

    // Function to find the index of the minimum element (pivot)
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + arr.length) % arr.length;
            int next = (mid + 1) % arr.length;

            // Check if mid is the smallest element
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[mid] >= arr[start]) {
                // Left side is sorted, move to right side
                start = mid + 1;
            } else {
                // Right side is sorted, move to left side
                end = mid - 1;
            }
        }
        return -1; // Array is not rotated
    }

    // Function to perform binary search in a sorted array
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input target value to search for
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Find the pivot index
        int pivot = findPivot(arr);

        // If the array is not rotated, search the entire array
        if (pivot == -1) {
            System.out.println("Element found at index: " + binarySearch(arr, target, 0, n - 1));


        }

        // Search in both halves of the rotated array
        if (arr[pivot] == target) {
            System.out.println("Element found at index: " + pivot);
        } else if (target >= arr[0] && target < arr[pivot]) {
            System.out.println("Element found at index: " + binarySearch(arr, target, 0, pivot - 1));
        } else {
            System.out.println("Element found at index: " + binarySearch(arr, target, pivot + 1, n - 1));
        }


    }
}
