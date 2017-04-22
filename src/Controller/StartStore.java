package Controller;

import Model.UserList;
import View.LogIn;

import java.io.*;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class StartStore {


    public static void main (String [] args) throws IOException, ClassNotFoundException {

        int revenues;
        int costs;
        int profits;

        UserList database;

        File file = new File("Database.ser");

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

        //Store Landing Page
        LogIn logIn = new LogIn();



        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Database.ser"));
                    out.writeObject(database);
                    out.close();
                }
                catch (Exception e)
                {

                }
            }
        }));




        //read in inventory
        //read in users



    }
}
