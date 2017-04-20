package Controller;

import Model.Inventory;
import Model.User;
import Model.UserList;
import View.LogIn;

import java.io.File;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class StartStore {


    public static void main (String [] args){

        File file = new File("Database.dat");
        Inventory inventory;

        UserList list = new UserList();
        User user = new User("buyer", "password", "buyer");

        list.addUser(user);

        System.out.println("In the right place");

        //read in inventory
        //read in users


        //Store Landing Page
        LogIn logIn = new LogIn();

    }
}
