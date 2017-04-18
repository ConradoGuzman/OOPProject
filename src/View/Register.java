package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class Register {

    private JPanel panel1;
    private JButton registerButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JTextField textField1;
    private JButton cancelButton;

    public Register(String username) {
        JFrame frame = new JFrame("Registration Portal");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Start start = new Start();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Start start = new Start();
            }
        });
    }
}
