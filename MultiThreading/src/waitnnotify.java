public class waitnnotify {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Thread one = new Thread(()->{
            try{
                one();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }




        });

        Thread two = new Thread(()->{
            try {
                two();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });


        one.start();
        two.start();


    }

    private static void one() throws InterruptedException{
        synchronized (lock){
            System.out.println("Hello from method one..");
            lock.wait();
            System.out.println("Back again in the method one");
        }
    }

    private static void two() throws InterruptedException{
        synchronized (lock){
            System.out.println("Hello from method two..");
            lock.notify();
            System.out.println("Back again in method two... even after notifiying");
        }
    }


}
//difference between wait and sleep
//wait is used for inter thread communication and synchronization where as sleep is used for just stopping the
//thread