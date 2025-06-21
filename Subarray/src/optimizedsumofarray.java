public class optimizedsumofarray {
    public static int optimisedsum(int[]A){
        int[] PS = new int[A.length-1];
        PS[0] = A[0];
        for(int i = 0; i<A.length;i++){
            PS[i] = PS[i-1] + A[i];

        }
        for ()

    }
    public static void main(String[] args) {

    }
}
