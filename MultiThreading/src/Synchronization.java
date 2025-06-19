public class Synchronization {
    private static int counter =0;
    public static void main(String[] args) {
        Thread one = new Thread(()->{
            int counter = 0;
            for (int i = 0; i < 15 ; i++) {
                counter++;


            }
        });
        Thread two = new Thread(()->{

        })

    }
}
