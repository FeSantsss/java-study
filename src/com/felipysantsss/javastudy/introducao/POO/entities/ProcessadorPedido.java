package com.felipysantsss.javastudy.introducao.POO.entities;

public abstract class ProcessadorPedido {
    public abstract void validar();
    public abstract void cobrar();
    public abstract void notificar();
    public final void processar(){
        notificar();
        cobrar();
        validar();
    }
}
