package sandboxCode.MVC;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Created by robfredric 2017.
 */
public class View extends JFrame {

    //10 is the integer parameter the app will read
    private JTextField number1 = new JTextField(10);

    //enter age is the label by the first text box
    private JLabel actionLabel = new JLabel("Enter an Integer");

    //submit is the button label
    private JButton submitButton = new JButton("Press for Even/Odd");
    private JTextField total = new JTextField(50);

    View() {

        //Making the view
        //creating the panel that will be viewed

        JPanel appPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //size of the panel window
        this.setSize(600, 200);

        appPanel.add(number1);
        appPanel.add(actionLabel);
        appPanel.add(submitButton);
        appPanel.add(total);
        this.add(appPanel);
    }

    // way of getting the first  number from the user
    public int getNumber1() {
        return Integer.parseInt(number1.getText());
    }

    //parameters for if 18 or not
    public void setTotal(boolean answer) {
        if (answer) {
            total.setText("You submitted an even number");
        } else {
            total.setText("you submitted an odd number");
        }
    }

    //when button is clicked method will execute
    void addSubmitButton(ActionListener listenForTotalButton) {
        submitButton.addActionListener(listenForTotalButton);
    }

    //popup that error message passed
    void errorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }



}
