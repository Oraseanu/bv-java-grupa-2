package com.siit.oraseanu.app.business;

import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.ProductStock;

import java.util.HashMap;

public class Seller implements BusinessEntity {
    String storeName;
    private double incomingMoney;
    private double outgoingMoney;
    HashMap<Integer, ProductStock> warehouse = new HashMap<Integer, ProductStock>();

    public void supplyWith(int quantity, Product product) {

    }
    public void sell(int quantity, Product product, BusinessEntity buyer) {

    }


}
