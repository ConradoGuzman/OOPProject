package Model;

import java.util.ArrayList;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class Inventory {



    private ArrayList<Product> inventory = new ArrayList();

    Product sandisk = new Product("Flash Drive", "SanDisk", 5, "Office Supplies", 10, 5, 10);
    Product pen = new Product("pen", "Pentel", 2, "Office Supplies", 5, 2, 10);


    public Inventory() {
        this.inventory = inventory;
    }

    public void addProduct(Product product)
    {
        inventory.add(sandisk);
        inventory.add(pen);

    }
}
