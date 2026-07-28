package com.felipysantsss.javastudy.introducao.methods;

import java.util.Scanner;

public class MethodsStudies002 {
    public static double average(int[] arr){
        double sum=0;
        if (arr.length==0){
            System.out.println("Array empty!");
            return 0;
        }
        for (int num : arr){
            sum+=num;
        }
        return sum/arr.length;
    }
    public static int studentsAboveAverage(int[] arr, double average){
        int sum=0;
        if (arr.length==0){
            System.out.println("Array empty!");
            return 0;
        }
        for(int ages : arr){
            if (ages>average){
                sum++;
            }
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double average;
        do {
            System.out.print("Enter the students array lenght: ");
            int lenght = input.nextInt();

            if (lenght < 1 || lenght > 20) {
                System.out.println("Invalid input!");
                System.out.println("Enter a number between 1 and 20.");

                continue;
            }
            int[] array = new int[lenght];

            System.out.println("Enter " + lenght + " students ages:");
            for (int i=0; i < lenght; i++){
                array[i] = input.nextInt();
            }

            average = average(array);
            int studentsAbove = studentsAboveAverage(array, average);
            System.out.println("The average is: " + average);
            System.out.println("Students above average is: " + studentsAbove);
            break;
        } while (true);
        input.close();
    }
}
