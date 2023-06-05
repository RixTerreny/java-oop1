package org.learning.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto macchina = new Prodotto( "Audi a3", "Va veloce",23344.50);
        System.out.println("Codice: " + macchina.getCode());
    }
}
