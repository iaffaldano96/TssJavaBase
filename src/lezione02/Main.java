/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02;

/**
 * Esempio di commenti
 * @author tss
 */
public class Main {

    //variabili ==> campi o proprietà o attributi
    //statica
    private static int colore; 
    //d'istanza
    private int carattere;
    
    /**
     * Da questo metodo partirà l'esecuzione del pregramma
     * @param args 
     */
    public static void main(String[] args) {
        
        System.out.println("Start esempio commenti..");
        
        //variabili locali
        String frase;
        int totNumeroUtenti=10;
        if(totNumeroUtenti>0){
            int x = 5;
        }
        else{
            int x=6;
        }
        
        // if ternario
        frase = (totNumeroUtenti>0) ? "Tota positivo" : "Tot negativo";
        
        int x=4;
        
        System.out.println("Totale: "+totNumeroUtenti);
        System.out.println(frase);

    }    
}
