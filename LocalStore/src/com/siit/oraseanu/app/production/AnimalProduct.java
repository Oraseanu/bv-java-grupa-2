package com.siit.oraseanu.app.production;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AnimalProduct extends Product {
    private double keepTemperature;

    public AnimalProduct(String name, double price, double weight, Date productionDate, int validity, double keepTemperature){
        super(name, price, weight, productionDate, validity);
        this.keepTemperature = keepTemperature;
    }

}
