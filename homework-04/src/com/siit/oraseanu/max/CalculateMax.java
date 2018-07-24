package com.siit.oraseanu.max;

/**
 * @author Daniel Oraseanu
 * class that has only a method to return the maximum value from 2 integers.
 */
public class CalculateMax {

    /**
     *
     * @param val1 first integer
     * @param val2 second integer
     * @return maximum velue between the 2 integer parameters
     */
    public int getMax(int val1, int val2){
        return val1 >= val2 ? val1 : val2;
    }
}
