package View;

import javax.swing.*;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Buyer extends javax.swing.JFrame {
    private JPanel BuyerHome;
    private JTable table1;
    private JTextPane textPane1;

    public Buyer(String username) {

        JOptionPane.showMessageDialog(null, "welcome " + username + "!");

        JFrame frame = new JFrame("Buyer Portal");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}

