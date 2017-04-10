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

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check credentials

                String username = textField1.getText();
                String password = passwordField1.getText();

                if (username.contentEquals("user") && password.contentEquals("Password")){
                    System.out.println(textField1);
                    JFrame frame = new JFrame("Shopping Cart");
                    frame.pack();
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "welcome!");
                    frame.dispose();
                    Buyer buyer = new Buyer(frame);

                    buyer.setVisible(true);
                }

                else if(username.contentEquals("seller") && password.contentEquals("Password")){
                    System.out.println(textField1);
                    JFrame frame = new JFrame("Shopping Cart");
                    frame.pack();
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "welcome!");
                    frame.dispose();
                    Buyer buyer = new Buyer(frame);

                    buyer.setVisible(true);
                }

                else{

                    JOptionPane.showMessageDialog(null, "Please Enter Valid Credential");
                }

            }
        });
    }


    public static void logInHome() {
        JFrame frame = new JFrame("Shopping Cart Program");
        frame.setContentPane(new Login().LoginHome);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
