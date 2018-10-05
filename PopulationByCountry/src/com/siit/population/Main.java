
package com.siit.population;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\SIIT\\Exercises\\resources\\content.csv";
        //exercise.urlToFile(args[0]);
        //exercise.urlToConsole(args[0]);
        FileParser f = new FileParser(path);
        f.populateCountryData(path);
        Country ro = f.getCountryOf("Romania");
        Printer.countryFromAll(f.getCountries(),"Romania");
        System.out.println("Max pop: " + ro.getMaxPopulation());
        System.out.println("Min pop: " + ro.getMinPopulation());
        System.out.println("In year " + ro.getYearOfPopulation(22865950L) +
                " " + ro.getName() + " had a population of " +
                ro.getPopulationOf(ro.getYearOfPopulation(22865950L)));
        System.out.println(Printer.printPeaksOf(ro));

    }
}
