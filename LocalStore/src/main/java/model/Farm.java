package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Farm {
    private HashMap<String, List<Product>> warehouse = new HashMap<>();

    public Farm() {
        warehouse.put("vegetable products", new ArrayList<Product>());
        warehouse.put("animal products", new ArrayList<Product>());
    }

    public Product productIsAvailable(String type, String name) throws Exception {
        for (Product product : warehouse.get(type)) {
            if (product.getName().equals(name)) {
                return product;
            } else {
                throw new Exception("Product not available ");
            }
        }
        return null;
    }

    public void addVegetableProduct(Product product){
        warehouse.get("vegetable products").add(product);
    }

    public void addAnimalProduct(Product product){
        warehouse.get("animal products").add(product);
    }

    public String getVegetableProducts(){
        String products = "\n";
        int i = 1;
        for (Product product:warehouse.get("vegetable products"))
        {
            products = products + ("   " + i++ + "." + product.toString() + "\n");
        }
    return products;
    }

    public String getAnimalProducts(){
        String products = "\n";
        int i = 1;
        for (Product product:warehouse.get("animal products"))
        {
            products = products + ("   " + i++ + "." + product.toString() + "\n");
        }
        return products;
    }

    @Override
    public String toString() {
        return "Farm products:" +
                "\n> vegetable products:" + getVegetableProducts() +
                "\n> animal products:" + getAnimalProducts();
    }
}
