package com.felipysantsss.javastudy.introducao.projects.library;

import com.felipysantsss.javastudy.introducao.projects.library.entities.Book;
import com.felipysantsss.javastudy.introducao.projects.library.entities.Reader;

import java.util.Scanner;

public class SystemLibrary {
    public static void initializeLibrary(){
        Scanner sc = new Scanner(System.in);
        int choice;
        Reader reader = null;
        Book[] booksList; // aprender ArrayList

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
        } while (choice != 0);
        System.out.println("Ty for this!");
    }


}
