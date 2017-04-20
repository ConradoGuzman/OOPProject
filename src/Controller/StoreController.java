package Controller;

import Model.UserList;
import View.Buyer;
import View.Register;
import View.Seller;

import javax.swing.*;

/**
 * Created by conradoguzman on 4/19/17.
 */
public class StoreController {

    UserList list = new UserList();

    public void login(JFrame frame, JTextField usernameEntered, JTextField passwordEntered){

        String username = usernameEntered.getText();
        String password = passwordEntered.getText();
        System.out.println(password);

        if (list.searchUser(username)){

            System.out.println("In the right place");

            if (list.getUser(username).getUsrPassword().equals(passwordEntered))
            {
                if (list.getUser(username).getUsrType().equals("buyer"))
                {
                    System.out.println("In the right place");
                    frame.dispose();
                    Buyer buyer = new Buyer();
                }
                else if (list.getUser(username).getUsrType().equals("seller"))
                {
                    frame.dispose();
                    Seller seller = new Seller();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid credentials", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
                }
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
}
