package Controller;

import Model.Inventory;
import Model.UserList;
import View.LogIn;

import java.io.*;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class StartStore {

    /**
     * Main program that initiates the view panels.
     * @param args Not Used
     * @throws IOException if file is not found
     * @throws ClassNotFoundException if incorrect input
     */
    public static void main (String [] args) throws IOException, ClassNotFoundException {

        int revenues;
        int costs;
        int profits;

        /**
         * Call to initiate the database object for the users
         */
        UserList database;
        /**
         * Call to initiate the database object for the inventory
         */
        Inventory inventoryDB = Inventory.getInstance();

        /**
         * Read in the the contents of the users database
         */
        File file = new File("Users.dat");


        if (file.isFile() && file.canRead())
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            database = (UserList) in.readObject();
            UserList.resetInstance(database);
            in.close();
        }
        else
        {
            database = UserList.getInstance();
        }


        /**
         * Read in the the contents of the inventory database
         */
        Inventory InventoryDatabase;

        File file2 = new File("Inventory.dat");

        if (file2.isFile() && file2.canRead())
        {
            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(file2));
            InventoryDatabase = (Inventory) in2.readObject();
            Inventory.resetInstance(InventoryDatabase);
            in2.close();
        }
        else
        {
            InventoryDatabase = Inventory.getInstance();
        }

        /**
         *Initiates the view for the landing page
         */
        LogIn logIn = new LogIn();

        /**
         * system close this saves state of users and inventory to file.
         */
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Inventory inventoryDB = Inventory.getInstance();
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Users.dat"));
                    out.writeObject(database);
                    out.close();

                    ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("Inventory.dat"));
                    out2.writeObject(inventoryDB);
                    out2.close();

                }
                catch (Exception e)
                {

                }
            }
        }));

    }
}
