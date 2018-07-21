package com.siit.oraseanu.datavalid;

/**
 * @author Daniel Oraseanu
 * This class validates time read from keyboard input
 */
public class DataValidation {
    int hh;
    int mm;

    /**
     *
     * @param hh string for hour
     * @param mm string for minutes
     * @return true if hh and mm passed in are valid time format together
     */
    public static boolean isValid(String hh, String mm) {
        String hhmm = hh + ":" + mm;
        if (hhmm.matches("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")){
            return  true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param hh time passed in as String
     * @param mm minutes passed in as string
     * @return a time validation message
     */
    public String timeIs(String hh, String mm){
        String result = "Incorrect time!";
        if (isValid(hh,mm)){
            result = "The time is " + hh + ":" + mm + " now.";
        }
        return result;
    }
}
