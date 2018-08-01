package com.siit.oraseanu.app.production;

import java.util.Date;
import java.util.List;

public class VegetableProduct extends Product {
    private List<String> vitamins;

    public VegetableProduct(String name, double price, double weight, Date productionDate, int validity, List<String> vitamins){
        super(name, price, weight, productionDate, validity);
        this.vitamins = vitamins;
    }
}
