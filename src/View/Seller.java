package View;

import Model.Inventory;
import Model.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/6/17.
 * Controller for the Seller pane
 */
public class Seller {
    public JPanel SellerPane;
    private JPanel home;
    private JButton logOutButton;
    private JButton updateButton;
    private JButton addItemsButton;
    private JButton removeItemsButton;
    private JTable table1;

    /**
     * Creates a JFrame for the seller pane.
     */
    public Seller(){

        JFrame frame = new JFrame("Seller Portal");
        frame.setContentPane(home);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayProducts();

        /**
         * Action Listener for the log out button.
         */
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LogIn logIn = new LogIn();
            }
        });

        /**
         * Action Listener for the add items button
         */
        addItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                AddItem add = new AddItem();
            }
        });

        /**
         * Action listener for the remove items button
         */
        removeItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    /**
     * Display funtion that populates the contents of the JTable.
     */
    public void displayProducts()
    {
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Product", "Description", "ID", "Cost", "Price", "Quantity", "Update"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }


        });

        DefaultTableModel theListTable = (DefaultTableModel) table1.getModel();
        ArrayList<Product> allItems = Inventory.getInstance().getProductList();


        for(Product product : allItems) {
            theListTable.addRow(new Object[]{product.getProdName(), product.getProdDesc() , product.getProdID(), product.getProdCost(), product.getProdPrice(),
                     product.getProdQty(), false});
        }

    }

}
