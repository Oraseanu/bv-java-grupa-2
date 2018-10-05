package com.siit.population;

import java.util.Map;

public interface Country {

    String getName();
    Map<String, Long> getPopulation();
    Long getPopulationOf(String year);
    String getYearOfPopulation(Long value);
    Long getMaxPopulation();
    Long getMinPopulation();

}
