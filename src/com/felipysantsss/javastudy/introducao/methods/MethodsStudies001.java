package com.felipysantsss.javastudy.introducao.methods;

import java.util.Scanner;

public class MethodsStudies001 {
    public static double sum(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){ return a-b; }
    public static double mult(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        if(b == 0){
            System.out.println("division by zero!");
            return 0;
        }
        return a/b;
    }
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);


        char repeat;
        do {
            System.out.println("Hello, make a choice!");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Pow");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice > 6 || choice < 1) {
                System.out.println("Invalid choice!");
                repeat = 'y';
                continue;
            }
            if (choice == 6){
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.println(makeChoice(choice, num1, num2));


            System.out.println("Repeat? y/n");
            repeat = sc.next().charAt(0);
        } while (repeat == 'y');
        System.out.println("Ty! Make with <3");
        sc.close();
    }
    public static double makeChoice(int choice, double num1, double num2){
        return switch (choice){
            case 1 -> sum(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mult(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> pow(num1, num2);
            default ->  0;
        };
    }


    public static void main(String[] args){
        menu();
    }
}
