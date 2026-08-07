package com.felipysantsss.javastudy.introducao.POO.entities;

import java.util.Objects;

public class Cpf {
    protected String number;

    public Cpf(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cpf cpf)) return false;
        return Objects.equals(number, cpf.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
