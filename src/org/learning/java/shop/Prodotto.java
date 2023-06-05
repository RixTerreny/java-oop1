package org.learning.java.shop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    private int code;
    private String name;
    private String description;
    private double price;
    private final int vat = 22;

    private int generateCode(){
        return random.nextInt(99999999);
    }

    Prodotto( String name, String description, double price){
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getCode(){
        return this.code;
    }
}
