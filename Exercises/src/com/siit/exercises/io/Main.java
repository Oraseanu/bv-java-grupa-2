
package com.siit.exercises.io;

import javax.print.attribute.PrintRequestAttribute;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\SIIT\\Exercises\\resources\\content.csv";
        //exercise.urlToFile(args[0]);
        //exercise.urlToConsole(args[0]);
        FileParser f = new FileParser(path);
        f.populateCountryData(path);
        Printer.countryFromAll(f.getCountries(),"Albania");
        Printer.printPeaksOf(f.getCountryOf("Albania"));

    }
}
