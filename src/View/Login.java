package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/6/17.
 */
public class Login {
    private JTextField textField1;
    private JPanel LoginHome;
    private JPasswordField passwordField1;
    private JButton loginButton;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Shopping Cart");
                //System.out.println("Cool");
                //frame.set
                //frame.setContentPane(Seller().SellerPane);
                //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                //frame.dispose();
            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Shopping Cart");
        frame.setContentPane(new Login().LoginHome);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
