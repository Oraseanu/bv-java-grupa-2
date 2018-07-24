package com.siit.oraseanu.GenerateStuff;

import java.util.Objects;

public class Book {
    String author;
    String name;
    int numberOfPages;

    public Book() {
    }

    public Book(String author, String name, int numberOfPages) {
        this.author = author;
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(author, book.author) &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, name, numberOfPages);
    }
}
