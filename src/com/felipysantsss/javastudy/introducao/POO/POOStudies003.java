package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.Circle;
import com.felipysantsss.javastudy.introducao.POO.entities.Form;
import com.felipysantsss.javastudy.introducao.POO.entities.Square;

public class POOStudies003 {
    public static void main(String[] args){
        Form circle = new Circle(4.5);
        Form square = new Square(23.5);

        System.out.println(circle.area());
        System.out.println(square.area());
    }
}
