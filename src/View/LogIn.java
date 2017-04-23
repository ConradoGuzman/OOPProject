package View;

import Controller.StoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by conradoguzman on 4/16/17.
 */
public class LogIn {
    private JTextField passwordField1;
    private JTextField usernameField;
    private JButton loginButton;
    private JButton registerButton;
    private JPanel home;
    private JButton quitButton;
    private StoreController controller = new StoreController();

    public LogIn() {

        JFrame frame = new JFrame("Login Portal");

        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(loginButton);



        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Launch User Registration
                controller.register(frame);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check credentials
                controller.login(frame, usernameField, passwordField1);
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Program termination






                controller.quit(frame);
            }
        });
    }
}
