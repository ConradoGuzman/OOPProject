package View;

import Controller.StoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/9/17.
 * Controller for the register panel
 */
public class Register {

    private JPanel panel1;
    private JButton registerButton;
    private JTextField userName;
    private JButton cancelButton;
    private JTextField pw1;
    private JTextField pw2;
    private JComboBox comboBox1;
    private StoreController controller = new StoreController();

    /**
     * Creates new Register pane and frame
     */
    public Register() {
        JFrame frame = new JFrame("Registration Portal");
        frame.setContentPane(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        /**
         * Action listener for the register button
         */
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.registerUsr(frame, userName, pw1, pw2, comboBox1);
            }
        });

        /**
         * Action listener for the cancel button
         */
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.logOut(frame);
            }
        });
    }
}
