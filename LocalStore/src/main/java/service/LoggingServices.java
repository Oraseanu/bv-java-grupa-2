package service;


import model.ProductEntity;

import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.err;

public class LoggingServices {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final String FILE_NAME = "DailySalesLog.txt";
    private static final File log = new File(FILE_NAME);


    public static void appendSalesLog(ProductEntity newSale){
        Date dateOfLastInputs;
        Date today = new Date();

        try(FileWriter writer = new FileWriter(log, true)) {
            dateOfLastInputs = new Date(log.lastModified());
            if(!sdf.format(dateOfLastInputs).equals(sdf.format(today))) {
                writer.write("\r\nSales done on " + sdf.format(today) + "\r\n");
            }
            writer.write("     " + newSale.toString() + "\r\n");

        } catch (Exception e) {
            err.println("IOException: " + e.getMessage());
        }
    }

    public static void listSalesLog() throws IOException{
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if(log.exists()){
            desktop.open(log);
        }
    }

}
