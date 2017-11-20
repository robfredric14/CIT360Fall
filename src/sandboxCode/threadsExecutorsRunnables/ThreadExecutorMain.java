package sandboxCode.threadsExecutorsRunnables;

import java.util.concurrent.Executors;
//ThreadPoolExecutor implements both ExecutorService and Executor

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadExecutorMain {

    public static void main(String[] args) {



        //ThreadPoolExecutor implements both ExecutorService and Executor
        //By using thread pools we simply implement the thread pool to manually create the threads for us.
        //This allows better management and use of threads
        //This will create the pool of threads and we will make it run with a pool size of 15
        ThreadPoolExecutor Executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(15);

        //Executor1 is the name of the The ThreadPoolExecutor being used and linking the executor interface to a
        //fixed thread size for the pool

        for(int i=0; i < 15; i++) {
            try {
                //allowing each thread to sleep for 1/2 second
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //creating an Executor Task named process and giving the thread something to do
            //uses the for loop created above for naming the processes
            ThreadExecutor process = new ThreadExecutor("process " + i);
            System.out.println("New process added: " + process.getName());
            Executor1.execute(process);
        }

        try {
            // Will shutdown executorService after waiting for all tasks to finish up
            System.out.println("Will try to shutdown ExecutorService after tasks have completed");
            Executor1.shutdown();
            Executor1.awaitTermination(5, TimeUnit.SECONDS);
        }
        // If tasks were interrupted, we can have the system print this line
        catch (InterruptedException e) {
            System.err.println("Tasks interrupted");
        }
        finally {
            // If Executor1 is not terminated then output the line below
            if (!Executor1.isTerminated()) {
                System.err.println("Unfinished tasks will be shutdown");
            }

            // The reason you shut down is so that you can make sure the threads don't continue to run
            Executor1.shutdownNow();
            System.out.println("Completed shutdown");

            //UNHAPPY PATH......

            //if you don't shutdown the application will never stop, my cpu useage was high and couldn't figure out why
            //until I realized I didnt have a shutdown incorporated
        }



    }
}
