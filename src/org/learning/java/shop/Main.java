package org.learning.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto macchina1 = new Prodotto( "Audi A3", "Va veloce",23344.50);
        System.out.printf("Codice prodotto: %08d%n", macchina1.getCode());
        System.out.println("Nome: " + macchina1.getName());
        System.out.println("Descrizione: " + macchina1.getDescription());
        System.out.println("Prezzo senza IVA: " + macchina1.getPrice());
        System.out.println("Nome esteso: " + macchina1.getExtendedName());
        System.out.println("Prezzo con IVA: " + macchina1.getFullPrice() + "\n");
        macchina1.setName();
        System.out.println("Nome modificato con il setter: " + macchina1.getName());
    }
}
