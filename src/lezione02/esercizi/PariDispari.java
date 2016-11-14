/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero intero da tastiera e stampa se pari o dispari
 * @author tss
 */
public class PariDispari {

    public static void main(String[] args) {
              
        int num;
        String risultato;
        Scanner kb= new Scanner(System.in);
        System.out.print("Inserisci il numero:");
        num= kb.nextInt();
       
        if((num%2)!=0)
            risultato= "Il numero "+num+" è dispari";
        else
            risultato= "\nIl numero "+num+" è pari";
        System.out.println(risultato);
    }
}
