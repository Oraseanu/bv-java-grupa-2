/**
 * @author Daniel Oraseanu
 * Tema 4 - Functii
 */
package com.siit.oraseanu;

import com.siit.oraseanu.datavalid.DataValidation;
import com.siit.oraseanu.ftoc.FahrenheitToCelsius;
import com.siit.oraseanu.max.CalculateMax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("1. Read three numbers from the console and prints the biggest of them.");
        System.out.print("first number: ");
        int n1 = number.nextInt();
        System.out.print("second number: ");
        int n2 = number.nextInt();
        System.out.print("third number: ");
        int n3 = number.nextInt();
        CalculateMax calculateMax = new CalculateMax();
        System.out.println("" +
                "The biggest value from " + n1 + ", " + n2 + ", " + n3 + " is: " +
                calculateMax.getMax(n1,calculateMax.getMax(n2,n3)));

        System.out.println("\n2. For a given body temperature, measured in Fahrenheit degrees, outputs it in Celsius degrees.");
        System.out.print("Temperature in Fahrenheit:");
        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
        n1 = number.nextInt();
        System.out.print("Your body temperature in Celsius degrees is ");
        try {
            System.out.println(fahrenheitToCelsius.FToC(n1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n3. What time is it?\nPlease enter hours(hh):");
        String hh = number.next();
        System.out.print("Please enter minutes(mm):");
        String mm = number.next();
        DataValidation dataValidation = new DataValidation();
        System.out.println(dataValidation.timeIs(hh,mm));

    }
}
