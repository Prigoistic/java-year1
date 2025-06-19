public class DaemonThreads {
    public static void main(String[] args){

        Thread bgthread = new Thread(new DaemonHelper());
        Thread usrThread = new Thread(new UserThread());
        bgthread.setDaemon(true);

        bgthread.start();
        usrThread.start();

    }
}

class DaemonHelper implements Runnable{
    @Override
    public void run(){
        int count =0;
        while(count<500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon Helper running..");
        }

    }
}
class UserThread implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("User thread running...");

    }
}

//This shows that user threads have higher priority than background threads or daemon threads as in this example, even tho the while
//loop for the daemon thread was set to 500, the JVM was stopped when User thread got active after 5000ms or 5 secs
