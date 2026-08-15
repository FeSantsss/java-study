package com.felipysantsss.javastudy.introducao.POO.entities;

public class Bike extends Vehicle{
    private final double maxSpeed;

    public Bike(String brand, String model, double maxSpeed) {
        super(brand, model);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void start(){
        super.start();
        System.out.println("Bike is starting");
        System.out.println("Vrummmmmm!!!");
    }

    @Override
    public String toString() {
        return "Bike: " +
                "maxSpeed: '" + maxSpeed +
                " KM/H" + '\'' +
                ", brand: '" + brand + '\'' +
                ", model: '" + model + '\'';
    }
}

