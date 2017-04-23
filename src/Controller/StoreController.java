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
public class StoreController {

    UserList list = getInstance();



    private User user;

    public void login(JFrame frame, JTextField usernameEntered, JTextField passwordEntered){

        String username = usernameEntered.getText();
        String password = passwordEntered.getText();



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

    public void register(JFrame frame){
        frame.dispose();
        Register register= new Register();
    }

    public void quit(JFrame frame){
        //JOptionPane.showMessageDialog(null, "Bye Felicia", "Program Termination", JOptionPane.WARNING_MESSAGE);

        System.exit(0);
    }


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


    public void logOut(JFrame frame) {
        frame.dispose();
        LogIn logIn = new LogIn();
    }

    public void additemPanel(Product newItem){

        Inventory local = Inventory.getInstance();
        local.addProduct(newItem);
    }
}


