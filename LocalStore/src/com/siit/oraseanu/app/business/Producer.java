package com.siit.oraseanu.app.business;

import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.ProductStock;

import java.util.HashMap;

public class Producer implements BusinessEntity {
    private String name;
    private double incomingMoney = 0;
    private double outgoingMoney = 0;
    private HashMap<Integer, ProductStock> warehouse = new HashMap<Integer, ProductStock>();

    public Producer(String name, double outgoingMoney) {
        this.name = name;
        this.outgoingMoney = outgoingMoney;
    }

    public void supplyWith(int quantity, Product product) {

    }
    public void sell(int quantity, Product product, BusinessEntity buyer) {

    }


}
