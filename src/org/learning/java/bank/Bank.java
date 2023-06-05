package org.learning.java.bank;

import org.learning.java.shop.Prodotto;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Inserire il nome: ");
        String nameInput = keyboardInput.nextLine();

        Conto conto1 = new Conto(nameInput);

        while (true){
            System.out.println("Premi 1 per effettuare un versamento, 2 per prelevare o 3 per uscire: ");
            int chosenNumber = keyboardInput.nextInt();

            if (chosenNumber == 1){
                System.out.println("Inserisci l'importo: ");
                conto1.makeADeposit(keyboardInput.nextDouble());
            } else if (chosenNumber == 2) {
                System.out.println("Inserisci l'importo: ");
                conto1.makeAWithdraw(keyboardInput.nextDouble());
            } else if (chosenNumber == 3) {
                return;
            }else {
                System.out.println("Input non valido");
            }
        }
    }
}
