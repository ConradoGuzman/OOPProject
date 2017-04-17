package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by conradoguzman on 4/16/17.
 */
public class Start {
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JButton loginButton;
    private JButton registerButton;
    private JPanel home;

    public Start() {

        JFrame frame = new JFrame("Login Portal");

        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Register(textField1.getText());
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check credentials

                String username = textField1.getText();

                if (username.contentEquals("buyer")){

                    new Buyer();
                    frame.dispose();
                }

                else if (username.contentEquals("seller")){

                    new Seller();
                    frame.dispose();
                }


                else{
                    JOptionPane.showMessageDialog(null, " Please Enter Valid Credentials");
                }

            }
        });

    }
}
