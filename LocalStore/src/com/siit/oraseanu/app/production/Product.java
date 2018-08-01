package com.siit.oraseanu.app.production;

import java.util.Date;

public class Product {
    private String name;
    private double price;
    private double weight;
    private Date productionDate;
    private int validity;

    public Product(String name, double price, double weight, Date productionDate, int validity) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productionDate = productionDate;
        this.validity = validity;
    }
}
