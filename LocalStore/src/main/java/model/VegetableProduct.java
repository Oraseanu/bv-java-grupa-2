package model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class VegetableProduct extends Product {
    private List<String> vitamins;

    public VegetableProduct(String name, double price, double weight, Date productionDate, int validity, List<String> vitamins){
        super(name, price, weight, productionDate, validity);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return  "name: " + super.getName() +
                " | price: " + super.getPrice() +
                " | weight: " + super.getWeight() +
                " | productionDate: " + sdf.format(super.getProductionDate()) +
                " | validity: " + super.getValidity() +
                " | vitamins=" + vitamins.toString();
    }
}
