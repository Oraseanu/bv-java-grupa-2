package com.siit.exercises.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileParser {
    private static String filePath;
    private static String[] years;
    private static List<Country> countries = new ArrayList<>();

    public FileParser(String filePath){
        this.filePath = filePath;
    }

    public static List<Country> getCountries() {
        return countries;
    }

    public Country getCountryOf(String country){
        List<Country> result = new ArrayList<>();
        result = countries.stream()
                .filter(c -> c.getName().equals(country))
                .collect(Collectors.toList());
        return result.get(0);
    }

    private static String[] getYears() {
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
            return br.readLine().split(",");
        }catch (IOException e){
            System.out.println(e.getMessage());
            return new String[0];
        }
    }

    private static String[] popFirst(String[] array){
        return Arrays.copyOfRange(array,1,array.length);
    }

    public static void populateCountryData(String filePath) {
        try(LineNumberReader lr = new LineNumberReader(new FileReader(new File(filePath)))){
            String line;
            line = lr.readLine();
            while (line !=null){
                if (lr.getLineNumber()==1){
                    years = popFirst(getYears());
                    line = lr.readLine();
                }
                countries.add(new CountryData
                        .Builder(line.split(",")[0])
                        .withPopulation(years,popFirst(line.split(",")))
                        .build());
                line = lr.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
