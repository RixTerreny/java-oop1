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
            System.out.println("Premi 1 per effettuare un versamento, 2 per prelevare, 3 per visualizzare le info del tuo conto o 4 per uscire: ");
            int chosenNumber = keyboardInput.nextInt();

            if (chosenNumber == 1){
                System.out.println("Inserisci l'importo: ");
                conto1.makeADeposit(keyboardInput.nextDouble());
            } else if (chosenNumber == 2) {
                System.out.println("Inserisci l'importo: ");
                conto1.makeAWithdraw(keyboardInput.nextDouble());
            }else if (chosenNumber == 3) {
                System.out.println("Numero conto: " + conto1.getBankAccountNumber() + "\n");
            } else if (chosenNumber == 4) {
                return;
            }
        }
    }
}
