import java.util.ArrayList;
import java.util.Scanner;

public class arraylists {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println();
        int num;
        while ((num = scanner.nextInt()) != -1) {
            arr.add(num);
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        double average = (double) sum / arr.size();

        int smallerCount = 0;
        int greaterCount = 0;
        for (int i : arr) {
            if (i < average) {
                smallerCount++;
            } else if (i > average) {
                greaterCount++;
            }
        }

        System.out.println(average);
        System.out.println(smallerCount);
        System.out.println(greaterCount);
    }
}