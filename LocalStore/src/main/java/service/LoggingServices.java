package service;


import model.ProductEntity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingServices {

    public  void appendSalesLog(ProductEntity newSale){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fileName = "DailySalesLog.txt";
        File log = null;
        FileWriter writer = null;
        Date dateOfLastInputs;
        Date today = new Date();

        try {
            log = new File(fileName);
            writer = new FileWriter(log, true);
            dateOfLastInputs = new Date(log.lastModified());
            if(!sdf.format(dateOfLastInputs).equals(sdf.format(today))) {
                writer.write("\nSales done on " + sdf.format(today) + "\n");
            }
            writer.write("     " + newSale.toString() + "\n");

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.err.println("IOException at close: " + e.getMessage());
            }
        }
    }

}
