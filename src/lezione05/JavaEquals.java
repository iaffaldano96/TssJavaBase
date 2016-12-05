/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Arrays;

/**
 *
 * @author tss
 */
public class JavaEquals {
    public static void main(String[] args) {
        
        Autista p=new Autista("giusy","verdi","B");
        Autista a=new Autista("cristy", "blu","B");
        
        Autista daCercare=new Autista("winki", "lala", "C");
        
        Object[] persone=new Object[2];
        persone[0]=a;
        persone[1]=p;
        
        int risultato=cerca(persone,daCercare);
        /*int risultato=Arrays.binarySearch(persone, daCercare);
            metodo già fatto di quello che avevamo fatto noi
        */
        System.out.println(risultato);
        
    }
    
    /**
     * Ricerca un elemento nel vettore e returna l'indice 
     * della prima occorrenza trovata
     * @param anagrafica vettore dove ricercare
     * @param elementoelemento da caricare dentro il vettore
     * @return indice dell'elemento se trovato, se no -1
     */
    
    public  static int cerca(Object[] anagrafica,Object elemento){
        for(int i=0;i<anagrafica.length;i++){
            if(anagrafica[i].equals(elemento))
                return i;
        }
        return -1;
    }
}
