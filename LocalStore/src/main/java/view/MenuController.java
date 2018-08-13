package view;

import service.LoggingServices;
import service.ProductServices;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MenuController {
    private final Scanner menuOption = new Scanner(System.in);
    private HashMap<Integer, Actionable> mainMenu = new HashMap<Integer, Actionable>();
    private HashMap<Integer, Actionable> createProductMenu = new HashMap<Integer, Actionable>();
    private ProductServices productServices = new ProductServices();

    public MenuController() {
        setMainMenu();
        setCreateProductMenu();
    }

    public void setMainMenu() {

        //create product and add it to stock
        mainMenu.put(1, new Actionable(){
            public void act() {
                showCreateProductView();
            }
        });

        //sell product
        mainMenu.put(2, new Actionable(){
            public void act() {
                showSellProductView();
                int answer;
                do {
                    productServices.sellProduct();
                    System.out.println("\nSell one more product? (y = 1/n = 0)");
                    answer = menuOption.nextInt();
                } while (answer == 1);
                System.out.println(productServices.localStore);
                showHomeView();
            }
        });

        //show daily report
        mainMenu.put(3, new Actionable(){
            public void act() {
                try {
                    LoggingServices.listSalesLog();
                } catch (IOException e) {
                }
            }
        });

        //exit
        mainMenu.put(4, new Actionable(){
            public void act() {
                System.exit(0);
            }
        });
    }

    public void setCreateProductMenu() {
        createProductMenu.put(1, new Actionable(){
            public void act() {
                int answer;
                do {
                    productServices.readAnimalProduct();
                    System.out.println("\nAdd one more animal  product? (y = 1/n = 0)");
                    answer = menuOption.nextInt();
                } while (answer == 1);
                System.out.println(productServices.farm);
                showCreateProductView();
            }
        });
        createProductMenu.put(2, new Actionable(){
            public void act() {
                int answer;
                do {
                    productServices.readVegetableProduct();
                    System.out.println("\nAdd one more vegetable  product? (y = 1/n = 0)");
                    answer = menuOption.nextInt();
                } while (answer == 1);
                System.out.println(productServices.farm);
                showCreateProductView();
            }
        });
        createProductMenu.put(3, new Actionable(){
            public void act() {
                showHomeView();
            }
        });
        createProductMenu.put(4, new Actionable(){
            public void act() {
                System.exit(0);
            }
        });
    }

    public void showHomeView(){
        System.out.print(
                "1. Create product and add it to stock\n" +
                "2. Sell product\n" +
                "3. Display daily sales report\n" +
                "4. Exit\n");
        System.out.println("Input option: ");
        Integer opt = menuOption.nextInt();
        mainMenu.get(opt).act();
    }

    public void showCreateProductView(){

        System.out.print(
                "1. Create animal product\n" +
                "2. Create vegetable produt\n" +
                "3. Go back\n" +
                "4. Exit\n");
        System.out.println("Input option: ");
        Integer opt = menuOption.nextInt();
        createProductMenu.get(opt).act();

    }

    public void showSellProductView(){
        System.out.print("Chose from the following products: \n" + productServices.farm);
    }


}
