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

    public Seller(){

        JFrame frame = new JFrame("Buyer Portal");

        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Start start = new Start();
            }
        });

    }


}
