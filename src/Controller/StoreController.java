package Controller;

import Model.Inventory;
import Model.Product;
import Model.User;
import Model.UserList;
import View.Buyer;
import View.LogIn;
import View.Register;
import View.Seller;

import javax.swing.*;

import static Model.UserList.*;

/**
 * Created by conradoguzman on 4/19/17.
 */

/**
 * Controller class containing functions from action listener buttons.
 */
public class StoreController {

    /**
     * Retrieve the singleton instance of my inventory
     */
    UserList list = getInstance();

    private User user;

    /**
     * Validates the user's login credentials and decides which user panel to show next.
     * @param frame - passes the current instance of the frame in order to close it out.
     * @param usernameEntered is the username entered by the user
     * @param passwordEntered is the password entered by the user
     */
    public void login(JFrame frame, JTextField usernameEntered, JTextField passwordEntered){

        /**
         * Retrieve the username and password from the GUI form
         */
        String username = usernameEntered.getText();
        String password = passwordEntered.getText();

        /**
         * Selects from which pane will be shown next
         */
        if (list.searchUser(username)){
            if ((list.getUser(username).getUsrPassword()).equals(password))
            {
                if (list.getUser(username).getUsrType().equals("buyer"))
                {
                    frame.dispose();
                    Buyer buyer = new Buyer();
                }
                if (list.getUser(username).getUsrType().equals("seller")) {
                    frame.dispose();
                    Seller seller = new Seller();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter valid credentials", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
            }

        }else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid credentials", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
        }

    }

    /**
     * Calls the register pane
     * @param frame is the current instance for the frame.
     */
    public void register(JFrame frame){
        frame.dispose();
        Register register= new Register();
    }

    /**
     * A quit function that allows the user to terminate the program
     * @param frame that we would like to close
     */
    public void quit(JFrame frame){
        JOptionPane.showMessageDialog(null, "Thanks for using my Program", "Program Termination", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }

    /**
     * Register user pane that validates the user input
     * @param frame is the current instance of the JFrame
     * @param userName is the username that the new user wants to use
     * @param pw1 the password entered by the user in the first text box
     * @param pw2 the password entered by the user in the second text box
     * @param comboBox1 Stipulates weather the user is to be a seller or a buyer.
     */
    public void registerUsr(JFrame frame, JTextField userName, JTextField pw1, JTextField pw2, JComboBox comboBox1) {

        if (!pw1.getText().equals(pw2.getText())){
            JOptionPane.showMessageDialog(null, "Passwords Do not Match", "Passwords Do not Match", JOptionPane.WARNING_MESSAGE);
        }

        else {
            if(comboBox1.getSelectedIndex() == 0)
            {
                user = new User(userName.getText(), pw1.getText(), "buyer");
                JOptionPane.showMessageDialog(null, "Please Log in " + userName.getText() + ", Happy Shopping!", "Registered", JOptionPane.INFORMATION_MESSAGE);
            }
            if(comboBox1.getSelectedIndex() == 1)
            {
                user = new User(userName.getText(), pw1.getText(), "seller");
                JOptionPane.showMessageDialog(null, "Please Log in " + userName.getText(), "Registered", JOptionPane.INFORMATION_MESSAGE);
            }
            list.addUser(user);
            frame.dispose();
            LogIn logIn = new LogIn();
        }
    }

    /**
     * Returns the user to the login pane
     * @param frame is the current instance of the JFrame
     */
    public void logOut(JFrame frame) {
        frame.dispose();
        LogIn logIn = new LogIn();
    }

    /**
     * Calls the AddItem Panel
     * @param newItem that we are looking to add tot the inventory
     */
    public void additemPanel(Product newItem){

        Inventory local = Inventory.getInstance();
        local.addProduct(newItem);
    }
}


