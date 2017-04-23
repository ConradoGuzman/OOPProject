package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class Inventory extends ArrayList<Inventory> {

    private ArrayList<Product> inventory;
    private static Inventory instance = new Inventory();
    /**
     * Creates the variables that store the profit and loss details
     */
    private double revenues;
    private double costs;
    private double profits;

    /**
     * Hard coded objects to be entered into the inventory
     */

    //Product sandisk = new Product("Flash Drive", "SanDisk", "FLASH01", "Office Supplies", 10, 5, 10);
    //Product pen = new Product("pen", "Pentel", "PEN01", "Office Supplies", 5, 2, 10);

    /**
     * Constructor fot the inventory
     */
    private Inventory() {

        inventory = new ArrayList<>();
        //inventory.add(sandisk);
        //inventory.add(pen);
    }

    /**
     * Method to access the inventory
     * @return the inventory
     */
    public ArrayList<Product> getProductList(){
        return inventory;
    }

    public void addProduct(Product product) {

        inventory.add(product);
    }

    /**
     * Method to remove an item from the inventory
     * @param product object to be removed
     */
    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    /**
     * Returns the instance of the inventory
     * @return current instance
     */
    public static Inventory getInstance() {
        return instance;

    }

    /**
     * Setter that allows for a product to be updated.
     * @param product to be modified
     * @param name product name
     * @param description product description
     * @param qty product quantity
     * @param cost product cost
     * @param price product price
     */
    public void updateProduct(Product product, String name, String description, int qty, double cost, double price) {

        product.setProdName(name);
        product.setProdDesc(description);
        product.setProdCost(cost);
        product.setProdPrice(price);
        product.setProdQty(qty);
    }



    public void addToCart(Product product) {

    }

    public double getRevenues() {
        return revenues;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public double getProfits() {
        return profits;
    }

    public void setProfits(int profits) {
        this.profits = profits;
    }

    public void setRevenues(int revenues) {
        this.revenues = revenues;
    }

    /**
     * Allows for the current instance of the inventpory to be set to the data reaad in from the file
     * @param list data read in from the file
     */
    public static void resetInstance(Inventory list)
    {
        instance = list;
    }

    @Override
    public Stream<Inventory> stream() {
        return null;
    }
}
