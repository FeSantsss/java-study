package com.felipysantsss.javastudy.introducao.projects.library.services;

import com.felipysantsss.javastudy.introducao.projects.library.entities.Book;
import com.felipysantsss.javastudy.introducao.projects.library.entities.Reader;
import com.felipysantsss.javastudy.introducao.projects.library.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemLibrary {
    public static void initializeLibrary(){
        Scanner sc = new Scanner(System.in);
        int choice;
        Reader reader = null;
        List<Book> books = new ArrayList<>();

        System.out.println("Hello! Welcome to the my library.");
        do {
            System.out.println();
            System.out.println("Make your choice: ");
            System.out.println();
            System.out.println("(1) - Create a reader.");
            System.out.println("(2) - Create a book.");
            System.out.println("(3) - Show all books.");
            System.out.println("(4) - Show all available books.");
            System.out.println("(5) - Show my books.");
            System.out.println("(6) - Rent a book.");
            System.out.println("(7) - Return a book.");
            System.out.println("(0) - Exit");
            System.out.println();

            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice > 7 || choice < 0){
                System.out.println();
                System.out.println("Choice a valid value!");
            }

            reader = doChoice(choice, sc, reader, books);
        } while (choice != 0);
        sc.close();
        System.out.println("Ty for this!");
    }

    private static Reader doChoice(int choice ,Scanner input, Reader reader, List<Book> books){

        if (choice == 1 && reader != null){
            throw new AlreadyHaveAReaderException("Already exist a reader!");
        }

        switch (choice){
            case 1 -> {
                try {
                    System.out.println();
                    System.out.println("Ok! Create your reader:");
                    System.out.print("Enter the name: ");
                    String readerName = input.nextLine();

                    reader = new Reader(readerName);
                    System.out.println(reader);
                    System.out.println("Sucessed!");
                    System.out.println();
                } catch (NullPointerException e){
                    System.out.println("ERROR: " + e.getMessage());
                } catch (IllegalArgumentException e){
                    throw new IllegalArgumentException("Invalid input! Try again.");
                }
            }
            case 2 -> {
                try {
                    System.out.println();
                    System.out.println("Ok! Create a book:");
                    System.out.print("Enter a title: ");
                    String bookTitle = input.nextLine();
                    System.out.print("Enter a description: ");
                    String bookDescription = input.nextLine();

                    Book newBook = new Book(bookTitle, bookDescription);
                    books.add(newBook);
                    System.out.println();
                } catch (IllegalArgumentException e){
                    throw new IllegalArgumentException("Invalid input! Try again.");
                }
            }
            case 3 -> {
                System.out.println();
                if (books.isEmpty()){
                    throw new DontHaveBooksException("We dont have books!");
                }
                System.out.println("Books:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
            case 4 -> {
                System.out.println();
                if (books.isEmpty()){
                    throw new DontHaveBooksException("We dont have books!");
                }
                List<Book> booksAvailable = books
                        .stream()
                        .filter(book -> book.getReader() == null)
                        .toList();
                System.out.println("Books: " + booksAvailable);

            }
            case 5 -> {
                System.out.println();
                if (reader == null){
                    throw new DontExistAReaderException("Dont exist a reader! Make one.");
                }
                reader.showBooks();
            }
            case 6 -> {
                System.out.println();
                if (reader == null){
                    throw new DontExistAReaderException("Dont exist a reader! Make one.");
                }
                System.out.println("Which book do you want?");
                System.out.print("Enter the book title: ");
                String bookTitleWanted = input.nextLine();

                List<Book> booksWithTitleWanted = books
                        .stream()
                        .filter(book -> book.getTitle().equals(bookTitleWanted))
                        .toList();

                if (booksWithTitleWanted.isEmpty()){
                    throw new DontExistTheBookException("This book doesn't exist!");
                }

                Book bookAvailable = booksWithTitleWanted.
                        stream()
                        .filter(Book::isAvailable)
                        .findAny()
                        .orElseThrow(() -> new BookUnavailableException("This book is unavailable!"));

                bookAvailable.setReader(reader);
                reader.addBook(bookAvailable);
            }
            case 7 -> {
                System.out.println();
                if (reader == null){
                    throw new DontExistAReaderException("Dont exist a reader! Make one.");
                }
                System.out.println("Which book you want return?");
                System.out.print("Enter the book title: ");
                String bookTitleToReturn = input.nextLine();

                List<Book> booksWithTitleWanted = books
                        .stream()
                        .filter(book -> book.getTitle().equals(bookTitleToReturn))
                        .toList();

                if (booksWithTitleWanted.isEmpty()){
                    throw new DontExistTheBookException("This book doesn't exist!");
                }
                List<Book> readerBooks = reader.getBooks();
                Book bookToReturn;

                bookToReturn = readerBooks
                        .stream()
                        .filter(booksWithTitleWanted::contains)
                        .findAny()
                        .orElseThrow(() -> new FalseBookReturnException("You don't have this book!"));


                reader.removeBook(bookToReturn);
                bookToReturn.setReader(null);

            }
        }
        return reader;
    }
}
