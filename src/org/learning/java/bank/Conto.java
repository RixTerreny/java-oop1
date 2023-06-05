package org.learning.java.bank;

import java.util.Random;

public class Conto {
    Random random = new Random();

    private final int bankAccountNumber;
    private String accountantName;
    private double balance = 0;


    private int generateBankAccountNumber(){
        return random.nextInt(1,1000);
    }

    Conto(String name){
        this.accountantName = name;
        this.bankAccountNumber = generateBankAccountNumber();
    }

    public void makeADeposit(double deposit){
        this.balance = this.balance + deposit;
        System.out.println("Nuovo saldo: " + this.balance);
    }

    public void makeAWithdraw(double pay){
        if (pay>this.balance){
            System.out.println("Saldo insufficiente");
        }else{
            this.balance = this.balance-pay;
            System.out.println("Nuovo saldo: " + this.balance);
        }
    }

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
