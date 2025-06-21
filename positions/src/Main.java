
import java.util.*;



public class  Main{

    static int findPosition(int n, int a, int b)
    {

        return n - Math.max(a + 1, n - b) + 1;
    }




    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(findPosition(n, a, b));

    }
}
