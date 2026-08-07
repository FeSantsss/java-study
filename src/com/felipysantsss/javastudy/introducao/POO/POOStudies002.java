package com.felipysantsss.javastudy.introducao.POO;

import com.felipysantsss.javastudy.introducao.POO.entities.Cpf;

public class POOStudies002 {
    public static void main(String[] args){
        Cpf myCpf = new Cpf("123.456.789-10");
        Cpf myCpf2 = new Cpf("123.456.789-10");

        System.out.println(myCpf.equals(myCpf2));
    }
}
