package View;

import javax.swing.*;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Buyer extends javax.swing.JFrame {
    private JLabel BuyerPane;
    private JPanel BuyerHome;

    public Buyer(JFrame frame)
    {
        frame.setContentPane(new Buyer(frame).BuyerHome);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

}

