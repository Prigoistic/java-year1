    import java.util.Scanner;

    public class q1 {
        public static int insertionSort(int[] arr) {
            int n = arr.length;
            int shifts = 0;

            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                    shifts++;
                }

                arr[j + 1] = key;
            }

            return shifts;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int shifts = insertionSort(arr);
            System.out.println(shifts);
        }
    }