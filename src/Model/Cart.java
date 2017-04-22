package Model;

import View.Buyer;

import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class Cart {

    private ArrayList<Product> cartInstance = new ArrayList();

    private double total = 0;


    public void add(Product product) {

        cartInstance.add(product);
        total +=product.getProdPrice();

    }

    public void remove(Product product){

        cartInstance.remove(product);
        total -=product.getProdPrice();
    }


}

