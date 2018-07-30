package com.siit.oraseanu;

import java.util.*;

public class Cas {

    public static HashSet<Person> insuredPersons = new HashSet<>();

    private static Integer generateCid(Person person){
        return person.getCnp().hashCode();
    }

    public static boolean isInsured(Person person){
        return insuredPersons.contains(person);
    }

    public static String insurePerson(Person person){
        if (isInsured(person)){
            return "Person already insured";
        } else {
            insuredPersons.add(person);
            person.setCid(generateCid(person));
            Date date = new Date();
            person.setInsuranceDate(date);
            person.setInsured(true);
        }
        return "Person got insured";
    }


    @Override
    public String toString() {
        return ">Persoane asigurate:\n" + insuredPersons.toString();
    }
}
