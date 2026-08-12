package com.felipysantsss.javastudy.introducao.POO.entities;

import com.felipysantsss.javastudy.introducao.POO.interfaces.BuyMethod;

public class CreditCard implements BuyMethod {
    @Override
    public boolean buy(double value){
        System.out.println("buy: " + value + " on CreditCard"); return true;
    }
}
