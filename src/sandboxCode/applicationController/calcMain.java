package sandboxCode.applicationController;
import java.util.Scanner;
/**
 * Created by robfredric 2017.
 */
public class calcMain {
    public static void main(String[] args) {
        ApplicationController handoff = new ApplicationController();

        Integer number1;
        Integer number2;

        String command;
        String command2;

        // Scanner userinput will prompt the user to enter in information which will then be passed to the controller
        Scanner in = new Scanner(System.in);

        System.out.println("first number");
        number1= Integer.parseInt(in.nextLine());

        System.out.println("enter command");
        command = in.nextLine();

        System.out.println("second number");
        number2 = Integer.parseInt(in.nextLine());

        System.out.println("enter command");
        command2 = in.nextLine();



        handoff.commandProcess(command,command2, number1, number2);



    }
}
