package sandboxCode.threadsExecutorsRunnables2;


    import java.io.PrintStream;
    import java.util.*;

public class colorPicker implements Runnable {
    String name;
    int time;
    Random r = new Random();

    // Constructor
    public colorPicker(String x){
        name = x;
        time = r.nextInt(999);

    }
    // Creates run method. Run method is called whenever thread is started.
    @Override
    public void run(){
        PrintStream p = System.out;

        try{

            p.printf("%s is sleeping for %d\n", name, time);

            //thread to sleep
            Thread.sleep(time);
            p.printf("%s woke up from its sleep\n", name);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}