package com.felipysantsss.javastudy.introducao.projects.library.entities;

import com.felipysantsss.javastudy.introducao.projects.library.exceptions.DontExistAvailableBooksException;

import java.util.Objects;

public class Book {
    private String title;
    private String description;
    private Reader reader;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public boolean isAvailable(){
        if (reader != null){
            return false;
        }
        return true;
    }
    public void rentBook(Reader theReaderThatWantTheBook){
        if (reader != null){
            throw new DontExistAvailableBooksException("The " + title + " isn't available! Try again later.");
        }
        setReader(theReaderThatWantTheBook);
        System.out.println("Ok! This book is your now.");
    }
    public void returnTheBook(Reader theReaderThatWantReturnTheBook){
        if (!theReaderThatWantReturnTheBook.equals(reader)){
            System.out.println("This book isn't your.");
        }
        reader = null;
        System.out.println("Ok! good return.");
    }

    @Override
    public String toString() {
        return "Book: " + title + " - Description: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(reader, book.reader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, reader);
    }
}
