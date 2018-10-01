package com.siit.exercises.io;

import java.util.*;
import java.util.stream.IntStream;

public class CountryData implements Country{
    private String name;
    private Map<String, String> population = new LinkedHashMap<>();

    private CountryData() {
    }

    public static class Builder{
        private String name;
        private Map<String, String> population = new LinkedHashMap<>();

        public Builder(String name){
            this.name = name;
        }

        public Builder withPopulation(String[] years, String[] count){
            IntStream.range(0,years.length)
                    .forEach(index -> this.population.put(years[index],count[index]));

            return this;
        }

        public CountryData build(){
            CountryData countryData = new CountryData();
            countryData.name = this.name;
            countryData.population = this.population;

            return countryData;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<String, String> getPopulation(){
        return population;
    }

    @Override
    public String getPopulationOf(String year) {
        return population.get(year);
    }

    @Override
    public Double getMaxPopulation() {
        List<Double> populationSize = new LinkedList<>();
        population.values().forEach(value -> populationSize.add(Double.parseDouble(population.get(value))));
        return Collections.max(populationSize);
    }

    @Override
    public Double getMinPopulation() {
        List<Double> populationSize = new LinkedList<>();
        population.values().forEach(value -> populationSize.add(Double.parseDouble(population.get(value))));
        return Collections.min(populationSize);
    }

    @Override
    public String getYearOfPopulation(String value) {
        for (Object o : population.keySet()) {
            if (population.get(o).equals(value)) {
                return o.toString();
            }
        }
        return null;
    }



}
