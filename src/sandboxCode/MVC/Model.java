package sandboxCode.MVC;

/**
 * Created by robfredric 2017.
 */
public class Model {

    private boolean oddOrEvenValue;





    public void ageTrack(int number1) {


        // checking for odd or even number
        if (number1%2 == 0) {
            oddOrEvenValue = true;
        } else {
            oddOrEvenValue = false;
        }
    }


    public boolean getCalculationValue() {return oddOrEvenValue;}
}
