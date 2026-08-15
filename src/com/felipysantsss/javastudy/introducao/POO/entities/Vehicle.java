package com.felipysantsss.javastudy.introducao.POO.entities;

public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("Starting vehicle...");
    }
    public static void bibi(){
        System.out.println("BIBIIIIIIIIIIIIIIIIIIIIIIIIIII!!!!!!!!");
    }

}
