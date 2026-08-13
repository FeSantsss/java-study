package com.felipysantsss.javastudy.introducao.POO.interfaces;

public interface Nadador {
    default String mover(){
        return "nadando...";
    }
}
