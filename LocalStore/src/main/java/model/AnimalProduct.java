package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalProduct extends Product {
    private double keepTemperature;

    public AnimalProduct(String name, double price, double weight, Date productionDate, int validity, double keepTemperature){
        super(name, price, weight, productionDate, validity);
        this.keepTemperature = keepTemperature;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return  "name: " + super.getName() +
                " | price: " + super.getPrice() +
                " | weight: " + super.getWeight() +
                " | productionDate: " + sdf.format(super.getProductionDate()) +
                " | validity: " + super.getValidity() +
                " | keepTemperature=" + this.keepTemperature;
    }
}
