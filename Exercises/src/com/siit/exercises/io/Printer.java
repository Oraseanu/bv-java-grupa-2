/**
 * Exercise 1
 * Write a program which reads the content of a text file from a specified URL
 * and prints it out at the standard output stream.
 * The URL is specified as a command line argument.
 * An example file could be found at this URL:
 * https://openei.org/doe-opendata/dataset/a7fea769-691d-4536-8ed3-471e993a2445/resource/86c50aa8-e40f-4859-b52e-29bb10166456/download/populationbycountry19802010millions.csv
 *
 * Hints:
 * - use the java.net.URL class
 * - find the method on this class for opening an input stream in the Javadoc
 * - the content of the remote file should read line by line
 * (not byte by byte and not character by character)
 * - exceptions should be correctly handled
 * - try-with-resources should be used
 */
package com.siit.exercises.io;

import java.io.*;
import java.net.URL;
import java.util.List;

public class Printer {
    private static String path = "D:\\SIIT\\Exercises\\resources\\content.csv";

    public static void urlToFile(String url) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));){
            String line;
            line = br.readLine();
            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while(line !=null);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void urlToConsole(String url){
        String line;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()))){
            do{
                line = br.readLine();
                System.out.println(line);
            } while(line !=null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void countryFromAll(List<Country> countries, String country){
        countries.stream()
                .forEach(countryData -> {
                    if(country.equals(countryData.getName()))
                        System.out.println(countryData.getName() + "\n" + countryData.getPopulation());
                });
    }

    public static String printPeaksOf(Country country){

        return "Max population: "
                + country.getMaxPopulation()
                + "reached in year "
                + country.getYearOfPopulation(country.getMaxPopulation().toString())
                + "\n" +
                "Min population: "
                + country.getMinPopulation()
                + "reached in year "
                + country.getYearOfPopulation(country.getMinPopulation().toString());
    }
}
