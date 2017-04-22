package View;

import Model.Product;

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

    private void displayProducts()
    {
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Product", "ProductID", "Price", "In Stock", "Quantity", "Seller", "Purchase"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });



    }


}

