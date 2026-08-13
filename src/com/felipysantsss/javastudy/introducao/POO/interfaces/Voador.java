package com.felipysantsss.javastudy.introducao.POO.interfaces;

public interface Voador {
    default String mover(){
        return "voando...";
    }
}
