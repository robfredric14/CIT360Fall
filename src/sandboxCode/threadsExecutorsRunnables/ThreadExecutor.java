package sandboxCode.threadsExecutorsRunnables;

import java.util.Random;

/**
 * Created by robfredric 2017.
 */
public class ThreadExecutor implements Runnable {


    private int time;
    private String name;
    // For assigning a random sleep time.
    private Random r = new Random();

    public ThreadExecutor(String name) {
        this.name = name;
        time = r.nextInt(999);
    }

    public String getName() {
        return name;
    }

    @Override
    // Thread creation
    // implemented runnable from Thread Executor
    public void run() {
        // Prints name of the current thread
        System.out.println("Current thread = " + Thread.currentThread().getName());
        // Shows when a task is being executed concurrently with another thread,
        // then puts the thread to bed (I like saying that)
        try {
            System.out.println("Doing a task during : " + name);
            Thread.currentThread().sleep(time);
        }
        // Exception for when a thread is interrupted.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
