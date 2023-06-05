package org.learning.java.bank;

import java.util.Random;

public class Conto {
    Random random = new Random();

    private final int bankAccountNumber;
    private String accountantName;
    private double balance = 0;

    //Generating instance functions
    private int generateBankAccountNumber(){
        return random.nextInt(1,1000);
    }

    Conto(String name){
        this.accountantName = name;
        this.bankAccountNumber = generateBankAccountNumber();
    }

    //User actions
    public void makeADeposit(double deposit){
        this.balance = this.balance + deposit;
        System.out.printf("Nuovo saldo: %.2f€ \n" , this.balance );
    }

    public void makeAWithdraw(double pay){
        if (pay>this.balance){
            System.out.println("Saldo insufficiente \n");
        }else{
            this.balance = this.balance-pay;
            System.out.printf("Nuovo saldo: %.2f€ \n" , this.balance );
        }
    }

    //Getter and setter
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
