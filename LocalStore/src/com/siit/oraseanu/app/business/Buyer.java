package com.siit.oraseanu.app.business;

import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.ProductStock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Buyer implements BusinessEntity{
    String buyerName;
    private double moneyToSpend;
    private HashMap<Integer, ProductStock> boughtProducts = new HashMap<Integer, ProductStock>();

    public Buyer(String buyerName, double moneyToSpend) {
        this.buyerName = buyerName;
        this.moneyToSpend = moneyToSpend;
    }

    public void supplyWith(int quantity, Product product) {

    }
    public void sell(int quantity, Product product, BusinessEntity buyer) {

    }
}
