package sandboxCode.applicationController;

/**
 * Created by robfredric 2017.
 */
public class Multiplication implements MathHandle{

    public void execute(Integer number1, Integer number2){
        //when Multiplaication is called through the hashmap this total will run
        Integer total = number1 * (number2);
        //total will be output for the user when add is pulled from hashmap
        System.out.println("Multiplication() called " + number1 + " * " + number2 + " = "+ total);
    }
}
