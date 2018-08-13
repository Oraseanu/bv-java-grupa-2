package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LocalStore {
    private HashMap<String, List<ProductEntity>> warehouse = new HashMap<>();

    public LocalStore() {
        warehouse.put("vegetable products", new ArrayList<ProductEntity>());
        warehouse.put("animal products", new ArrayList<ProductEntity>());
    }

    public void addProduct(String type, ProductEntity productEntity){
        warehouse.get(type).add(productEntity);
    }

    public String getVegetableProducts(){
        String products = "\n";
        int i = 1;
        for (ProductEntity productEntity:warehouse.get("vegetable products"))
        {
            products = products + ("   " + i++ + "." + productEntity.toString() + "\n");
        }
        return products;
    }

    public String getAnimalProducts(){
        String products = "\n";
        int i = 1;
        for (ProductEntity productEntity:warehouse.get("animal products"))
        {
            products = products + ("   " + i++ + "." + productEntity.toString() + "\n");
        }
        return products;
    }

    @Override
    public String toString() {
        return "LocalStore products:" +
                "\n> vegetable products:" + this.getVegetableProducts() +
                "\n> animal products:" + this.getAnimalProducts();
    }
}
