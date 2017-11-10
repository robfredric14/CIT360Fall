package sandboxCode.applicationController;

/**
 * Created by robfredric 2017.
 */
public class MultiplyTen implements MathHandle{

    public void execute(Integer number1, Integer number2) {
        //when Multiplaication is called through the hashmap this total will run

        Integer total2 = (number1+number2) * 10;
        //total will be output for the user when add is pulled from hashmap
        System.out.println("MultiplyTen() called " + number1 + " + " + number2 + " * 10 = "+ total2);
    }


}


