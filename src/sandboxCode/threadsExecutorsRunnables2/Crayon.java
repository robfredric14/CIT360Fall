package sandboxCode.threadsExecutorsRunnables2;



public class Crayon {
    public static void main(String[] args) {

        Thread t1 = new Thread(new colorPicker("red"));
        Thread t2 = new Thread(new colorPicker("yellow"));
        Thread t3 = new Thread(new colorPicker("blue"));
        Thread t4 = new Thread(new colorPicker("cyan"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
