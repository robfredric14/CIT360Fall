package sandboxCode.threadsExecutorsRunnables;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by CHECK FOR FUNCTIONALITY AMONGST THE 3 FILES
 */
public class ExecutorTask implements Runnable {

    private int time;
    private String name;
    // For assigning a random sleep time.
    private Random r = new Random();

    public ExecutorTask(String name) {
        this.name = name;
        // creates random sleep time for thread
        time = r.nextInt(999);
    }

    public String getName() {
        return name;
    }

    @Override
    // Thread creation
    // Run method from the Runnable class.
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