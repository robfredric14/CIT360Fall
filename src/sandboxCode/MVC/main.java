package sandboxCode.MVC;

/**
 * Created by robfredric 2017.
 */
public class main {
    public static void main(String[] args) {


        //view and model
        View theView = new View();
        Model theModel = new Model();
        Controller theController = new Controller(theView, theModel);
        theView.setVisible(true);

    }
}
