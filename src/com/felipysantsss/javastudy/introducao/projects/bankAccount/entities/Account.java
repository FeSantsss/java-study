package com.felipysantsss.javastudy.introducao.projects.bankAccount.entities;

import com.felipysantsss.javastudy.introducao.projects.bankAccount.exceptions.NotEnoughStatementException;

import java.math.BigDecimal;

public class Account {
    protected String name;
    protected BigDecimal statement;

    public Account(String name, BigDecimal statement) {
        this.name = name;
        this.statement = statement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal seeStatementOnAccount(){
        return statement;
    }

    public void depositOnAccount(BigDecimal valueToDeposit){
        statement = statement.add(valueToDeposit);
    }

    public void sakeOnAccount(BigDecimal valueToSake){
        if (valueToSake.compareTo(statement) > 0){
            throw new NotEnoughStatementException("Insufficient statement.");
        }
        statement = statement.subtract(valueToSake);
    }

    @Override
    public String toString() {
        return "Account: " + name + " - " + statement + "$";
    }
}
