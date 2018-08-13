package model;

import java.util.Date;

public abstract class Product {
    private String name;
    private double price;
    private double weight;
    private Date productionDate;
    private int validity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public Product(String name, double price, double weight, Date productionDate, int validity) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productionDate = productionDate;
        this.validity = validity;
    }

    @Override
    public abstract String toString();

}
