package com.felipysantsss.javastudy.introducao.projects.library.entities;

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

    public void bookAvailable(Reader theReaderThatWantTheBook){
        if (reader != null){
            System.out.println("The " + title + " isn't available!");
            return;
        }
        System.out.println("The " + title + " is available.");
    }
    public void rentBook(Reader theReaderThatWantTheBook){
        if (reader != null){
            System.out.println("The " + title + " isn't available! Try again later.");
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
}
