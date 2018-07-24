package com.siit.oraseanu.GenerateStuff;

public class MainBook {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.author = "Lev Tolstoi";
        book1.name = "Anna Karenina";
        book1.numberOfPages = 900;
        System.out.println(book1);

        Book book2 = new Book();
        book2.author = "Lev Tolstoi";
        book2.name = "Anna Karenina";
        book2.numberOfPages = 900;
        System.out.println(book2);

        if(book1.equals(book2)){
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are NOT equal");
        }

        book1.setNumberOfPages(1000);
        System.out.println("book1 number of pages:" + book1.getNumberOfPages());

        Book book3 = new Book("Eminescu", "Poezii", 120);
        System.out.println(book3);
        System.out.println("book3 number of pages:"+ book3.getNumberOfPages());
    }
}
