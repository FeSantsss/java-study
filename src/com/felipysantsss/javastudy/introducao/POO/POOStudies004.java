package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.Drums;
import com.felipysantsss.javastudy.introducao.POO.entities.Guitar;
import com.felipysantsss.javastudy.introducao.POO.entities.Instrument;

public class POOStudies004 {
    public static void main(String[] args) {
        Instrument myGuitar = new Guitar();
        Instrument myDrums = new Drums();

        myGuitar.tune();
        myGuitar.sound();

        myDrums.tune();
        myDrums.sound();
    }
}
