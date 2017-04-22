package Model;

import java.util.ArrayList;

import static Model.Cart.*;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class Inventory {

    private ArrayList<Product> inventory;
    private static final Inventory instance = new Inventory();



    Product sandisk = new Product("Flash Drive", "SanDisk", 5, "Office Supplies", 10, 5, 10);
    Product pen = new Product("pen", "Pentel", 2, "Office Supplies", 5, 2, 10);


    private Inventory() {

        inventory = new ArrayList<>();
    }

    public void addProduct(Product product)
    {

        inventory.add(product);
    }

    public void removeProduct(Product product){
        inventory.remove(product);
    }

    public Inventory getInstance(){
        return instance;

    }

    public void updateProduct(Product product, String name, String description, int qty, double cost, double price ){

        product.setProdName(name);
        product.setProdDesc(description);
        product.setProdCost(cost);
        product.setProdPrice(price);
        product.setProdQty(qty);
    }

    public void addToCart(Product product){
        //Cart.add(product);
    }
}
