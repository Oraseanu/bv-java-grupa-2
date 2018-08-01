package com.siit.oraseanu.app.business;

import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.ProductStock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Buyer {
    private double moneyToSpend;
    private HashMap<Integer, ProductStock> boughtProducts = new HashMap<Integer, ProductStock>();
}
