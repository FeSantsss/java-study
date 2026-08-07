package com.felipysantsss.javastudy.introducao.POO.entities;

public class Car extends Vehicle {
    private String color;
    private double engine;

    public Car(String brand, String model, String color, double engine) {
        super(brand, model);
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public void start(){
        super.start();
        System.out.println("Car is starting");
        System.out.println("Rommmm...");
    }

    @Override
    public String toString() {
        return "model: " + getModel() + ", color: " + getColor() +
                ", engine: " + getEngine() + ", brand: " + getBrand();
    }
}
