package com.siit.oraseanu;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        char answer = 'n';

        System.out.println("Program citire persoane de la tastatura, validare si asigurare.");
        do{
            boolean personDataIsValid = true;
            StringBuilder invalidDataMessage = new StringBuilder("Person was not created due to wrog data:");

            System.out.print("Name:");
            String name = scanner.next();
            if (!validator.isValidName(name)) {
                invalidDataMessage.append("\n > Invalid name");
                personDataIsValid = false;
            }
            System.out.print("Surname:");
            String surname = scanner.next();
            if (!validator.isValidName(surname)) {
                invalidDataMessage.append("\n > Invalid surname");
                personDataIsValid = false;
            }
            System.out.print("CNP:");
            String cnp = scanner.next();
            if (!validator.isValidCnp(cnp)) {
                invalidDataMessage.append("\n > Invalid CNP");
                personDataIsValid = false;
            }
            if (personDataIsValid){
                Person person = new Person(name, surname, cnp);
                System.out.println("person was created");
                persons.add(person);
                System.out.println("Do you want to insure this person?(y/n)");
                char insure = scanner.next().charAt(0);
                if(insure == 'y'){
                    System.out.println(Cas.insurePerson(person));
                }
            } else {
                System.out.println(invalidDataMessage);
            }
            System.out.println("Do you want to add a new person? (y/n)");
            answer = scanner.next().charAt(0);

        } while (answer == 'y');

        System.out.println(Cas.insuredPersons.toString());

    }
}
