package com.felipysantsss.javastudy.introducao.POO.entities;

public class Square extends Form{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return Math.pow(side, 2);
    }
}
