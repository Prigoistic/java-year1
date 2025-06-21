public class sumofNnatural {
    public  static int sum(int N){
        if (N<=1){
            return 1;
        }
        return N + sum(N-1);
    }

    public static int fact(int N){
        if (N<=1){
            return 1;
        }
        return N * fact(N-1);
    }
    public static int fibo(int N){
        if(N<=1){
            return 1;
        }
        return fibo(N-1) + fibo(N-2);
    }


    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
