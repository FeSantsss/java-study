package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.Bike;
import com.felipysantsss.javastudy.introducao.POO.entities.Car;
import com.felipysantsss.javastudy.introducao.POO.entities.Vehicle;

public class POOStudies01 {
    public static void main(String[] args){
        Vehicle myCar = new Car("Bugatti", "Veyron", "black with blue", 8.0);
        Vehicle myBike = new Bike("Kawasaki", "H2R", 400.0);

        System.out.println(myCar);
        myCar.start();
        System.out.println(myBike);
        myBike.start();
    }

}
