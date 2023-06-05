package org.learning.java.shop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    private int code;
    private String name;
    private String description;
    private double price;
    private final double vat = 1.22;

    private int generateCode(){
        return random.nextInt(99999999);
    }

    Prodotto( String name, String description, double price){
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getExtendedName(){
        return this.name +"-"+ this.code;
    }

    public  double getFullPrice(){
        return this.price * this.vat;
    }

    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }



    public void setName(){
        this.name = "Fiat 500";
    }

    public void setDescription(){
        this.description = "Va piano";
    }

    public void setPrice(){
        this.price = 12200.34;
    }

}
