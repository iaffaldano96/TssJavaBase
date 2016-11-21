/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero intero da tastiera e stampa se è primo o no
 *
 * @author tss
 */
public class NumeroPrimo {

    public static void main(String[] args) {

        int num;
        String risultato;
        Scanner kb = new Scanner(System.in);
        System.out.print("Inserisci il numero:");
        num = kb.nextInt();
        boolean primo=true;

        if(num<=1){
            System.out.println("Non è un numero primo");
            System.exit(0);
        }
        int i = 1;
        while (i <= num && primo) {
            primo = (num % i !=0) || i==1 || i==num ;
            i++;
        }
        if(primo==true)
            risultato="Il munero è primo";
        else
            risultato="Il numero non è primo";
        System.out.println(risultato);
    }
}
