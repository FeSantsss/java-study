package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.CreditCard;
import com.felipysantsss.javastudy.introducao.POO.entities.Pix;
import com.felipysantsss.javastudy.introducao.POO.interfaces.BuyMethod;

public class POOStudies005 {
    public static void main(String[] args){
        BuyMethod[] myBuy = {new Pix(), new CreditCard()};
        for (BuyMethod b : myBuy) { b.buy(230); };
    }
}
