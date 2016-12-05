/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Date;

/**
 *
 * @author tss
 */

//println p funziona perché Persona estende Object
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Persona p=new Persona("ciao", "hi", new Date(96, 7, 6,18,14,00), "F");        
        System.out.println(p.getNome()+" "+p.getCognome()+", "+p.getDataNascita()+", "+p.getSesso());
        System.out.println(p.toString());
        //se nella class faccio @Override di toString, allora p può usare quel metodo di Object
        
        //con o vedo solo i metodi nella classe Object, quindi non posso usare gli stessi metodi di Persona
        //con p Persona vedo i metodi sia Object che di Persona
        
        //così op può usare i metodi di entrambe le classe, perché
        //è di Object, ma è new Persona
        Object op= new Persona("hello","salve");   
        System.out.println(op.toString());
        
        //
        Object opa=new Autista("goodbye","arrivederci","B");
        System.out.println(opa.toString());       
        
        Autista a= new Autista("bye", "salut", "B");
        Persona p2 =new Persona("Giusy", "Blu");
        Object[] persone=new Object[2];
        persone[0]=a;
        persone[1]=p2;
        stampa(persone);
        
    }
    
    public static void stampa(Object[] anagrafica){
        for (Object o : anagrafica) { // : for each [quando vuoi scorrere l'insieme e trovi l'oggetto
            System.out.println(o.toString());
        }
        //equivalente
       /* for(int i=0; i<anagrafica.length;i++){
            Object o=anagrafica[i];
        }*/
    }
}
