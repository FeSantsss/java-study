package com.felipysantsss.javastudy.introducao.projects.library.entities;

import java.util.Arrays;

public class Reader {
    private String name;
    private Book[] books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reader(String name) {
        this.name = name;
    }

    public void showBooks(){
        if (books.length == 0){
            System.out.println("You don't have books. Rent someone.");
        }
        System.out.println(Arrays.toString(books));
    }

    @Override
    public String toString() {
        return "Reader: " + name + "Books: " + Arrays.toString(books);
    }
}
