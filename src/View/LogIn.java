package View;

import Controller.StoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by conradoguzman on 4/16/17.
 * Controller for the Login panel
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getRootPane().setDefaultButton(loginButton);

        /**
         * Action listener for the register button on the login pane.
         */
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Launch User Registration
                controller.register(frame);
            }
        });

        /**
         * Action listener for the login button on the login pane
         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check credentials
                controller.login(frame, usernameField, passwordField1);
            }
        });

        /**
         * Action listener for the quit button on the login pane
         */
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Program termination
                controller.quit(frame);
            }
        });
    }
}
