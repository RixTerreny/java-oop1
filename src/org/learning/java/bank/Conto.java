package org.learning.java.bank;

public class Conto {
    private int bankAccountNumber;
    private String accountantName;
    private double balance = 0;

    public int getBankAccountNumber(){
        return this.bankAccountNumber;
    }

    public String getAccountantName(){
        return this.getAccountantName();
    }

    public double getBalance(){
        return this.balance;
    }

    public void setAccountantName(String name){
        this.accountantName = name;
    }
}
