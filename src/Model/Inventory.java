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

    private int revenues;
    private int costs;
    private int profits;


    Product sandisk = new Product("Flash Drive", "SanDisk", "FLASH01", "Office Supplies", 10, 5, 10);
    Product pen = new Product("pen", "Pentel", "PEN01", "Office Supplies", 5, 2, 10);


    private Inventory() {

        inventory = new ArrayList<>();
        inventory.add(sandisk);
        inventory.add(pen);
    }

    public ArrayList<Product> getProductList(){
        return inventory;
    }

    public void addProduct(Product product) {

        inventory.add(product);
    }

    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    public static Inventory getInstance() {
        return instance;

    }

    public void updateProduct(Product product, String name, String description, int qty, double cost, double price) {

        product.setProdName(name);
        product.setProdDesc(description);
        product.setProdCost(cost);
        product.setProdPrice(price);
        product.setProdQty(qty);
    }

    public void addToCart(Product product) {
        //Cart.add(product);
    }

    public int getRevenues() {
        return revenues;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getProfits() {
        return profits;
    }

    public void setProfits(int profits) {
        this.profits = profits;
    }

    public void setRevenues(int revenues) {
        this.revenues = revenues;
    }

    public static void resetInstance(Inventory list)
    {
        instance = list;
    }

    @Override
    public Stream<Inventory> stream() {
        return null;
    }
}
