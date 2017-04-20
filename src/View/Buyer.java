package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Buyer extends javax.swing.JFrame {

    private JButton addToCartButton;
    private JButton descriptionButton;
    private JButton checkoutButton;
    private JTable table1;
    private JPanel home;
    private JButton logOutButton;

    public Buyer() {

        JFrame frame = new JFrame("Buyer Portal");

        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LogIn logIn = new LogIn();
            }
        });
    }

}

