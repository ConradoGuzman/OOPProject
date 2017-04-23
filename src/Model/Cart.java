package Model;

import View.Buyer;

import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/17/17.
 * Fields and methods for the Cart class
 */
public class Cart {

    /**
     * Creates an arraylist object
     */
    private ArrayList<Product> cartInstance = new ArrayList();

    /**
     * Initiates a double variable to keep track of the order total
     */
    private double total = 0;

    /**
     * Function that adds a product to the instance of the inventory
     * @param product is the item that we are adding to the inventory
     */
    public void add(Product product) {

        cartInstance.add(product);
        total +=product.getProdPrice();

    }

    /**
     * Function that removes a product from the inventory
     * @param product the product object that we are removing
     */
    public void remove(Product product){

        cartInstance.remove(product);
        total -=product.getProdPrice();
    }


}

