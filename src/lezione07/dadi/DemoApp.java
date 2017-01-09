/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.dadi;

import lezione03.giocodadi.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input= JOptionPane.showInputDialog("Inserisci il nome");
        String n= JOptionPane.showInputDialog("Inserisci credito iniziale");
        int so=Integer.parseInt(n);
        
        //creo oggetto giocatore
        Giocatore g= new Giocatore(input,so);
        //creo il dado per il gioc e quello per il banco
        Dado gDado =new Dado(6);
        Dado bDado= new Dado(6);
        
        Contatore contaMani= new Contatore(0,1);
        while(g.saldo()>0){
            contaMani.conta();
            int lancioG = gDado.lancio();
            int lancioB= bDado.lancio();
            if(lancioG>lancioB){
                g.vince();
            }
            else
                g.perde();
            System.out.println("Risultato lancio ["+contaMani.valoreCorrente()+"]:  Giocatore->"+lancioG+"-----Banco->"+lancioB);
            g.stampa();

        }
        
        

    }
    
}
