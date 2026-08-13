package com.felipysantsss.javastudy.introducao.POO.entities;

import com.felipysantsss.javastudy.introducao.POO.interfaces.Nadador;
import com.felipysantsss.javastudy.introducao.POO.interfaces.Voador;

public class SalvageDuck implements Nadador, Voador {
    @Override
    public String mover(){
        return "voando e nadando...";
    }
}
