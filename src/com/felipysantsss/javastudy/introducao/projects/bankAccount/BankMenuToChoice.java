package com.felipysantsss.javastudy.introducao.projects.bankAccount;

import com.felipysantsss.javastudy.introducao.projects.bankAccount.entities.Account;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class BankMenuToChoice {
    public static void Menu(){
        Locale.setDefault(Locale.US);
        System.out.println("Welcome to the Bank of Santsss!");

        MenuChoice();
    }
    public static void MenuChoice(){
        Account newAccount = null;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choice a option:");

            System.out.println("(1) - Create a account");
            System.out.println("(2) - See statement");
            System.out.println("(3) - Deposit");
            System.out.println("(4) - Sake");
            System.out.println("(0) - Exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice < 0 || choice > 4){
                System.out.println("Choice a valid number!");
                continue;
            }

            newAccount = doChoice(sc, choice, newAccount);
        } while (choice != 0);
        System.out.println("Ty for test this!");
        sc.close();
    }
    public static Account doChoice(Scanner sc,int choice, Account newAccount){
        switch (choice){
            case 1 -> {
                if (newAccount == null){
                    try {
                        System.out.println("Ok! (1) - Create a account - selected.");
                        System.out.print("Enter your name: ");
                        String name = sc.nextLine().strip();
                        System.out.println("Enter your statement: ");
                        String statementString = sc.nextLine().strip();

                        BigDecimal realStatement = convertToBigDecimal(statementString);

                        newAccount = new Account(name, realStatement);
                        System.out.println("Created: " + newAccount);
                    } catch (IllegalArgumentException e){
                        System.out.println("ERROR! ANY VALUE ARE INVALID. TRY AGAIN!");
                    }
                } else {
                    System.out.println("an account already exists.");
                }
            }
            case 2 -> {
                System.out.println("Ok! (2) - See statement - selected.");
                if (newAccount == null){
                    System.out.println("Don't have an account. Create one.");
                } else {
                    System.out.println("Statement: " + newAccount.seeStatementOnAccount() + "$");
                }
            }
            case 3 -> {
                System.out.println("Ok! (3) - Deposit - selected.");
                if (newAccount == null){
                    System.out.println("Don't have an account. Create one.");
                } else {
                    System.out.print("Enter a value to deposit: ");
                    String valueToDepositString = sc.nextLine().strip();

                    BigDecimal realValueToDeposit = convertToBigDecimal(valueToDepositString);
                    newAccount.depositOnAccount(realValueToDeposit);
                    System.out.println("Deposited: " + realValueToDeposit + "$ on your account.");
                }

            }
            case 4 -> {
                System.out.println("Ok! (4) - Sake - selected.");
                if (newAccount == null){
                    System.out.println("Don't have an account. Create one.");
                } else {
                    System.out.print("Enter a value to sake: ");
                    String valueToSakeString = sc.nextLine().strip();

                    BigDecimal realValueToSake = convertToBigDecimal(valueToSakeString);
                    newAccount.sakeOnAccount(realValueToSake);
                    System.out.println("Saked: " + realValueToSake + "$ on your account.");
                }
            }
        };
        return newAccount;
    }
    public static BigDecimal convertToBigDecimal(String valueInText){
        String cleanText = valueInText.replace(".", "").replace(",", ".");
        BigDecimal statement = new BigDecimal(cleanText);
        if (statement.signum() <= 0){
            throw new IllegalArgumentException("Enter a positive value!");
        }
        return statement.setScale(2, RoundingMode.HALF_EVEN);
    }
}
