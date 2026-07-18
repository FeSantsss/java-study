package com.felipysantsss.javastudy.introducao;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudies01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] years = null;

        System.out.println("Enter the quantity of years old: ");
        int quantity = input.nextInt();
        years = new int[quantity];

        System.out.println("Ok! Enter " + quantity + " years old: ");
        for (int i=0; i<quantity; i++){
            years[i] = input.nextInt();
        }


        System.out.println("Years old: " + Arrays.toString(years));
    }
}

