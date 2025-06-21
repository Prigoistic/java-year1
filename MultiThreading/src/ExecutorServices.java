import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.ExecutorService.*;

public class ExecutorServices {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 5; i++) {
                executorService.execute(new Task(i));

            }
        }

    }

}

class Task implements Runnable{
    private final int taskid;

    public Task(int taskid) {
        this.taskid = taskid;
    }

    @Override
    public void run(){
        System.out.println("Task with id " + taskid + " being executed by Thread " + Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//Rather creating 5 different Threads here and giving each a Runnable interface, use .start() on each,, but here we are able to achieve all of that using
//executors using threadExecutors

//we dont have to deal with creation and destruction of threads now everything is handled by executorservice it self