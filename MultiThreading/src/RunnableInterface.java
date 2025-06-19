public class RunnableInterface {
    public static void  main(String[] args){
        Thread one = new Thread(new Thread1());
        Thread two = new Thread(new Thread2());


        one.start();
        two.start();


    }
}

class Thread1 implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 15; i++) {
            System.out.println("Thread 1 " + i);

        }
    }

}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Thread 2 " + i);

        }
    }
}
