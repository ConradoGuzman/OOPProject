package View;

import Controller.StoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/9/17.
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

    public Register() {
        JFrame frame = new JFrame("Registration Portal");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.registerUsr(frame, userName, pw1, pw2, comboBox1);

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.logOut(frame);
            }
        });
    }
}
