package sandboxCode.MVC;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Created by robfredric 2017.
 */
public class Controller {

    //Referencing created classes of view and model
    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;

        //tell the view that when the calc button is clicked
        //execute the actionPerformed method
        //in the calculateListener  inner class
        this.theView.addSubmitButton(new SubmitButton());

    }

    class SubmitButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int number1;

            try{
                number1 = theView.getNumber1();

                theModel.ageTrack(number1);
                theView.setTotal(theModel.getCalculationValue());
            } catch(NumberFormatException ex) {

                System.out.println(ex);

                theView.errorMessage("Make sure to enter an integer");
            }
        }
    }

}
