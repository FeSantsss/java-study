package com.felipysantsss.javastudy.introducao.projects.library.entities;

import com.felipysantsss.javastudy.introducao.projects.library.exceptions.DontHaveBooksException;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
    public void removeBook(Book book) { this.books.remove(book); }

    public List<Book> getBooks() {
        if (books.isEmpty()){
            throw new DontHaveBooksException("You don't have books. Rent someone.");
        }
        return books;
    }

    public Reader(String name) {
        this.name = name;
    }

    public Reader(String name, List<Book> books){
        this.name = name;
        this.books = books;
    }

    public void showBooks(){
        if (books.isEmpty()){
            throw new DontHaveBooksException("You don't have books. Rent someone.");
        }
        System.out.println("Books: " + books.toString());
    }

    @Override
    public String toString() {
        if (books.isEmpty()){
            return "Reader: " + name + " - Books: Don't have books yet";
        }
        return "Reader: " + name + "Books: " + books.toString();
    }
}
