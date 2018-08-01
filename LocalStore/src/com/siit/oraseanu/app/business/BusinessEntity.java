package com.siit.oraseanu.app.business;

import com.siit.oraseanu.app.production.Product;

public interface BusinessEntity {
    void supplyWith(int quantity, Product product);
    void sell(int quantity, Product product, BusinessEntity buyer);
}
