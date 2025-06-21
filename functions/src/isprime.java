import java.util.Scanner;

public class isprime {
    public static boolean prime(int A){
        boolean isprime = true;
        int i = 2;
        if (A<=1){
            isprime= false;
        }else {
            for ( i=2;i*i<=A;i++){
                if (A%i==0){
                    isprime = false;
                    break;

                }

            }
        }
        return i*i> A;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(prime(num));
    }
}
