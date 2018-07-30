package com.siit.oraseanu;

public class Validator {

    public static boolean isValidCnp(String cnp){
        return cnp.matches("[12]\\d\\d((0[1-9])|(1[0-2]))((0[1-9])|([12][0-9])|(3[01]))\\d{6}");
    }

    public static boolean isValidName(String name){
        return name.matches("([A-Z][-']?([a-z]{1,})[-']?([a-z]{1,})?){1}");
    }
}
