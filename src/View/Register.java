package View;

import javax.swing.*;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class Register {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;

    public Register(String username) {

        //JOptionPane.showMessageDialog(null, "welcome " + username + "!");

        JFrame frame = new JFrame("Registration Portal");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
