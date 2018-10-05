package com.siit.population;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountryData implements Country{
    private String name;
    private Map<String, Long> population = new LinkedHashMap<>();

    private CountryData() {
    }

    public static class Builder{
        private String name;
        private Map<String, Long> population = new LinkedHashMap<>();

        public Builder(String name){
            this.name = name;
        }

        public Builder withPopulation(String[] years, String[] count){
            population = IntStream.range(0, years.length).boxed()
                    .collect(Collectors.toMap(
                            i -> years[i],
                            i -> parseValueToNumber(count[i])
                    ));
            return this;
        }

        public CountryData build(){
            CountryData countryData = new CountryData();
            countryData.name = this.name;
            countryData.population = this.population;

            return countryData;
        }
    }

    public static Long parseValueToNumber(String value) { //2.03448
        if (value.equals("--") || value.equals("NA")) {
            return 0L;
        }

        String[] parts = value.split("\\.");
        String first = parts[0];
        String second = parts[parts.length-1];

        String fillWithZeros = second.concat("000000");
        String justSixNumbers = fillWithZeros.substring(0,6);

        return Long.parseLong(first.concat(justSixNumbers));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<String, Long> getPopulation(){
        return population;
    }

    @Override
    public Long getPopulationOf(String year) {
        return population.get(year);
    }

    @Override
    public Long getMaxPopulation() {
        List<Long> populationSize = population.keySet().stream()
                .map(k -> population.get(k))
                .collect(Collectors.toList());

        return Collections.max(populationSize);
    }

    @Override
    public Long getMinPopulation() {
        List<Long> populationSize = population.keySet().stream()
                .map(k -> population.get(k))
                .collect(Collectors.toList());

        return Collections.min(populationSize);
    }

    @Override
    public String getYearOfPopulation(Long value) {
        for (Object o : population.keySet()) {
            if (population.get(o).equals(value)) {
                return o.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder result = new StringBuilder();
        result.append("Country: " + this.name + "\nPopulation:\n");


        for(Map.Entry pair: population.entrySet()){
            i++;
            result.append(pair.getKey() + "->" + pair.getValue() + ", ");
            if (i == 8){
                result.append("\n");
                i = 0;
            }
        }
        return result.toString();
    }
}
