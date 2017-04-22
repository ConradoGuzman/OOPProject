package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Seller {
    public JPanel SellerPane;
    private JPanel home;
    private JButton logOutButton;
    private JButton updateQtyButton;
    private JButton addItemsButton;
    private JButton removeItemsButton;
    private JTable table1;
    private JLabel revenueLabel;
    private JLabel costLabel;
    private JLabel profitLabel;

    public Seller(){

        JFrame frame = new JFrame("Seller Portal");

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
