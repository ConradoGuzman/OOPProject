package Model;

import java.io.Serializable;

/**
 * Created by conradoguzman on 4/17/17.
 */
public class Product implements Serializable {
    private String prodName;
    private String prodDesc;
    private String prodID;
    private String prodType;
    private double prodPrice;
    private double prodCost;
    private int prodQty;



    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }

    public int getProdQty() {
        return prodQty;
    }

    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }

    public Product(String name, String desc, String iD, String type, double price, double cost, int qty ){
        this.prodName = name;
        this.prodDesc = desc;
        this.prodID = iD;
        this.prodType = type;
        this.prodPrice = price;
        this.prodCost = cost;
        this.prodQty = qty;
    }

}
