package service;


import model.*;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductServices {
    public Farm farm = new Farm();
    public LocalStore localStore = new LocalStore();
    LoggingServices loggingServices = new LoggingServices();

    public void readAnimalProduct(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Please create an animal product:");

        String name;
        System.out.print("name: ");
        name = inputValue.nextLine();

        double price;
        System.out.print("price: ");
        price = inputValue.nextDouble();

        double weight;
        System.out.print("weight: ");
        weight = inputValue.nextDouble();

        Date productionDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        sdf.format(productionDate);

        int validity;
        System.out.print("validity: ");
        validity = inputValue.nextInt();

        double keepTemperature;
        System.out.print("Keep at temperature of(Celsius): ");
        keepTemperature = inputValue.nextDouble();

        farm.addAnimalProduct(new AnimalProduct(name, price, weight, productionDate, validity, keepTemperature));
    }

    public void readVegetableProduct(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Please create a vegetable product:");

        String name;
        System.out.print("name: ");
        name = inputValue.next();

        double price;
        System.out.print("price: ");
        price = inputValue.nextDouble();

        double weight;
        System.out.print("weight: ");
        weight = inputValue.nextDouble();

        Date productionDate = new Date();

        int validity;
        System.out.print("validity: ");
        validity = inputValue.nextInt();

        System.out.println("Input vitamins separated by space:");
        inputValue.nextLine();
        String strVitamins = inputValue.nextLine();
        List<String> vitamins =Arrays.asList(strVitamins.split(" "));

        farm.addVegetableProduct(new VegetableProduct(name, price, weight, productionDate, validity, vitamins));
    }

    public void sellProduct(){
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Product type(animal - a / vegetable - v): ");
        String type = inputValue.nextLine();
        if (type.equals("a")) {
            type = "animal products";
        } else if(type.equals("v")){
            type = "vegetable products";
        } else {
            return;
        }

        System.out.println("Product name: ");
        String name = inputValue.nextLine();

        System.out.println("Quantity: ");
        int quantity = inputValue.nextInt();
        inputValue.nextLine();
        try {
            ProductEntity newSale = new ProductEntity(farm.productIsAvailable(type, name),quantity);
            localStore.addProduct(type, newSale);
            loggingServices.appendSalesLog(newSale);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
