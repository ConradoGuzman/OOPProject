package Controller;

import Model.Product;
import View.LogIn;

/**
 * Created by conradoguzman on 4/9/17.
 */
public class Store {


    public static void main (String [] args){

        LogIn logIn = new LogIn();

        Product flashDrive = new Product();
        flashDrive.setProdID("1");
        flashDrive.setProdName("Flash Drive");
        flashDrive.setProdCost(10);
        flashDrive.setProdPrice(20);
        flashDrive.setProdDesc("This is a Flash Drive");
        flashDrive.setProdQty(10);



    }
}
