/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero intero da tastiera e stampa se pari o dispari
 *
 * @author tss
 */
public class PariDispariAlternativo {

    public static void main(String[] args) {

        int num;
        String risultato = "";
        Scanner kb = new Scanner(System.in);
        System.out.print("Inserisci il numero:");
        num = kb.nextInt();
        int cont = 0;
        while (cont < num) {
            cont += 2;
        }
        if (num == cont) 
            risultato = "Il numero è pari";
        else 
            risultato = "Il numero è dispari";
        

        System.out.println(risultato);
    }
}
