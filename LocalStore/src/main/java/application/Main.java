package application;

import service.LoggingServices;
import view.MenuController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        MenuController m = new MenuController();
        m.showHomeView();


    }
}
