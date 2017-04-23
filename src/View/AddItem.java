package View;

import Controller.StoreController;
import Model.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conradoguzman on 4/22/17.
 * View controller for the add item from
 */
public class AddItem extends javax.swing.JFrame{
    //private JPanel addItemPanel;
    private JTextField name;
    private JTextField cost;
    private JTextArea description;
    private JTextField quantity;
    private JTextField price;
    private JTextField type;
    private JTextField iD;
    private JButton submitButton;
    private JButton cancelButton;
    private JPanel panel1;
    private JPanel addItemPanel;
    private StoreController controller = new StoreController();

    public  AddItem() {

        /**
         * Creates a new frame for the add item window.
         */
        JFrame frame = new JFrame("Add Item");

        frame.setContentPane(panel1);;
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        /**
         * Action listener for the submit button on the submit button.
         * Takes in all of the seller's input and passes the info to the product constructor
         * then adds it to the inventory. Finally closes the add item panel and closes the add
         * item panel.
         */
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    System.out.println(quantity.getText());
                    Product newItem = new Product(name.getText(), description.getText(),
                            iD.getText(), type.getText(),
                            Double.parseDouble(price.getText()), Double.parseDouble(cost.getText()),
                            Integer.parseInt(quantity.getText()));

                    controller.additemPanel(newItem);

                    Seller pane = new Seller();
                    frame.dispose();

                }
                catch(NumberFormatException nfe ){

                    JOptionPane.showMessageDialog(null, "Error with input", "Input Error", JOptionPane.WARNING_MESSAGE);
                    nfe.printStackTrace();
                }

            }
        });

        /**
         * Action listener for the cancel button. Closes the add item
         * panel and returns the seller to the seller pane
         */
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Seller seller = new Seller();
            }
        });
    }

}
