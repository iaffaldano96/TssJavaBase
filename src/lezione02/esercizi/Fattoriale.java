/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero intero da tastiera e stampa il suo fattoriale
 * @author tss
 */
public class Fattoriale {

    public static void main(String[] args) {
              
        int num;
        String risultato;
        Scanner kb= new Scanner(System.in);
        System.out.print("Inserisci il numero:");
        num= kb.nextInt();
       int fat=1;
        for(int i=1;i<=num;i++){
            fat=fat*i;
        }
        System.out.println(fat);
    }
}
