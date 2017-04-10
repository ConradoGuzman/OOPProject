package View;

import javax.swing.*;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Seller {
    public JPanel SellerPane;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTable table1;

    public Seller(String username){

        JOptionPane.showMessageDialog(null, "welcome " + username + "!");

        JFrame frame = new JFrame("Seller Portal");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


}
