public class Synchronization {
    private static int counter =0;
    public static void main(String[] args) {
        Thread one = new Thread(()->{

            for (int i = 0; i < 10000 ; i++) {
                counter++;


            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 10000 ; i++) {
                counter++;

            }

        });

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Counter value " + counter);




    }

    private synchronized static void increament(){
        counter++;
        //this section is called the critical section, thats why we are limiting the access to only 1 thread at a time
        //this process is called mutual exclusion

    }
}

//Theory
//Non Atomic Operation, this condition of not having 20000 is due to race condition.
