package com.siit.oraseanu.app.application;

import com.siit.oraseanu.app.business.BusinessEntity;
import com.siit.oraseanu.app.business.Buyer;
import com.siit.oraseanu.app.business.Producer;
import com.siit.oraseanu.app.business.Seller;
import com.siit.oraseanu.app.production.AnimalProduct;
import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.VegetableProduct;

import java.util.*;

public class Menu {
    HashMap<Integer, Produceable> appMenu = new HashMap<Integer, Produceable>();
    HashMap<String, List<BusinessEntity>> businessEntities = new HashMap<>();

    public void createBusinesses(){
        System.out.println("Please input a list of business entities. These will be the ones we will work with.");
        Scanner inputValue = new Scanner(System.in);

        List<BusinessEntity> producers = new ArrayList<>();
        System.out.println("Producer name:");
        String name = inputValue.next();
        System.out.println("Producer initial money:");
        double money = inputValue.nextDouble();
        Producer producer = new Producer(name, money);
        producers.add(producer);
        businessEntities.put("producers", producers);

        List<BusinessEntity> sellers = new ArrayList<>();
        System.out.println("Seller name:");
        name = inputValue.next();
        System.out.println("Seller initial money:");
        money = inputValue.nextDouble();
        Seller seller = new Seller(name, money);
        sellers.add(seller);
        businessEntities.put("sellers", sellers);

        List<BusinessEntity> buyers = new ArrayList<>();
        System.out.println("Buyer name:");
        name = inputValue.next();
        System.out.println("Buyer initial money:");
        money = inputValue.nextDouble();
        Buyer buyer = new Buyer(name, money);
        buyers.add(buyer);
        businessEntities.put("buyers", buyers);
    }



    public void createMenu(){
        appMenu.put(1, new Produceable(){
            public void produce(int quantity) {
                for(int i = 1; i <= quantity; i++){
                   readAnimalProduct();
                }
            }
        }); //map.get(1.1).produce(5);
        appMenu.put(2, new Produceable(){
            public void produce(int quantity) {
                for(int i = 1; i <= quantity; i++){
                    readVegetableProduct();
                }
            }
        }); //map.get(1.2).produce(4);
    }

    public void displayMenu(){
        System.out.println(
                "   Create new products:" +
                "1. Add animal products.\n" +
                "2. Add vegetable products.");
        Scanner menuOption = new Scanner(System.in);
        System.out.print("Input menu option: ");
        double opt = menuOption.nextDouble();
        System.out.print("How many products you want to create?: ");
        int quantity = menuOption.nextInt();
        appMenu.get(opt).produce(quantity);

    }

    public Product readAnimalProduct(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Please create an animal product:");

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

        double keepTemperature;
        System.out.print("Keep at temperature of(Celsius): ");
        keepTemperature = inputValue.nextDouble();

        return new AnimalProduct(name, price, weight, productionDate, validity, keepTemperature);
    }

    public Product readVegetableProduct(){
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

        System.out.print("Input vitamins separated by space:");
        String strVitamins = inputValue.next();
        List<String> vitamins =Arrays.asList(strVitamins.split(" "));

        return new VegetableProduct(name, price, weight, productionDate, validity, vitamins);
    }
}
