package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Login {
    private JTextField textField1;
    private JPanel LoginHome;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registerButton;

    public Login() {

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check credentials

                String username = textField1.getText();
                String password = passwordField1.getText();

                if (username.contentEquals("buyer") && password.contentEquals("Password")){

                    new Buyer(username);
                }

                else if(username.contentEquals("seller") && password.contentEquals("Password")){

                    new Seller(username);
                }

                else{
                    JOptionPane.showMessageDialog(null, username + " Please Enter Valid Credential");
                }

            }
        });
    }


    public static void logInHome() {
        JFrame frame = new JFrame("Shopping Cart Program");
        frame.setContentPane(new Login().LoginHome);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
