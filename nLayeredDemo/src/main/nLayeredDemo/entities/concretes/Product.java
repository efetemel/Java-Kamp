package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryID;
    private String name;
    private double unitPrice;
    private int unitInStock;

    public Product() {
    }

    public Product(int id, int categoryID, String name, double unitPrice, int unitInStock) {
        this.id = id;
        this.categoryID = categoryID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }
}
