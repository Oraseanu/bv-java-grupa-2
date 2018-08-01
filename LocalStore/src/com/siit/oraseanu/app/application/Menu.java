package com.siit.oraseanu.app.application;

import com.siit.oraseanu.app.production.AnimalProduct;
import com.siit.oraseanu.app.production.Product;
import com.siit.oraseanu.app.production.VegetableProduct;

import java.util.*;

public class Menu {
    HashMap<Double, Produceable> appMenu = new HashMap<Double, Produceable>();

    public void createMenu(){
        appMenu.put(1.1, new Produceable(){
            public void produce(int quantity) {
                for(int i = 1; i <= quantity; i++){
                   readAnimalProduct();
                }
            }
        }); //map.get(1.1).produce(5);
        appMenu.put(1.2, new Produceable(){
            public void produce(int quantity) {
                for(int i = 1; i <= quantity; i++){
                    readVegetableProduct();
                }
            }
        }); //map.get(1.2).produce(4);
    }

    public void displayMenu(){
        System.out.println("1.1 Add an animal product.\n" +
        "1.2 Add a vegetable product.");
        Scanner menuOption = new Scanner(System.in);
        System.out.print("Input menu option: ");
        double opt = menuOption.nextDouble();
        System.out.print("input quantity: ");
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
