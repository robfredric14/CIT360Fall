package sandboxCode.applicationController;

import java.util.HashMap;



/**
 * Created by robfredric on 6/6/2017.
 */
public class ApplicationController {

    //making the hashmap the controller will use to figure out what method to call
    //string is the key and MathHandle will be the value or the "command"
    //hash map will be called hashMapCommand
    public static HashMap<String, MathHandle> hashMapCommand = new HashMap();

    public void ApplicationController() {
    }
    public static void commandProcess(String command,String command2, Integer number1, Integer number2){

        hashMapCommand.put("+", new Addition());
        hashMapCommand.put("-", new Subtraction());
        hashMapCommand.put("*", new Multiplication());
        hashMapCommand.put("%", new Division());
        hashMapCommand.put("#", new MultiplyTen());
        hashMapCommand.put("!", new AdditionTen());
        hashMapCommand.put("@", new SubtractionTen());
        hashMapCommand.put("$", new DivisionTen());

        MathHandle handler = hashMapCommand.get(command);
        MathHandle handler2 = hashMapCommand.get(command2);

        handler.execute(number1, number2);
        handler2.execute(number1, number2);






    }
}


