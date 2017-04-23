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
    private JPanel home;
    private JButton logOutButton;
    private JTable table1;
    private JLabel orderTotal;

    public Buyer() {

        JFrame frame = new JFrame("Buyer Portal");

        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        displayProducts();

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LogIn logIn = new LogIn();
            }
        });

    }

    public JLabel getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(JLabel orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void displayProducts()
    {
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Product", "Description", "ID", "Cost", "Price", "Cost", "Quantity", "Purchase"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, true, false, true
            };

        });

    }


}

