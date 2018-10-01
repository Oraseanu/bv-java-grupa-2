package com.siit.exercises.io;

import java.util.Map;

public interface Country {

    String getName();
    Map<String, String> getPopulation();
    String getPopulationOf(String year);
    String getYearOfPopulation(String value);
    Double getMaxPopulation();
    Double getMinPopulation();

}
