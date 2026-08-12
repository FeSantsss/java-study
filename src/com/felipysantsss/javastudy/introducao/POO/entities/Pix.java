package com.felipysantsss.javastudy.introducao.POO.entities;

import com.felipysantsss.javastudy.introducao.POO.interfaces.BuyMethod;

public class Pix implements BuyMethod {
    @Override
    public boolean buy(double value){
        System.out.println("buy: " + value + " on Pix"); return true;
    }
}
