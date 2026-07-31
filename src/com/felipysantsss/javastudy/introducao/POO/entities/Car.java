package com.felipysantsss.javastudy.introducao.POO.entities;

public class Car {
    private String color;
    private String model;
    private double engine;


    public Car(String color, String model, double engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "model: " + getModel() + ", color: " + getColor() + ", engine: " + getEngine();
    }
}
