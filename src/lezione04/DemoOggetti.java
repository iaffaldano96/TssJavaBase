/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class DemoOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicicletta b1= new Bicicletta(10, 1);
        
        Bicicletta b2= new Bicicletta(10, 1);
        
        if(b1==b2)
            System.out.println("Uguali");
        else
            System.out.println("Diversi");
        
        //Bicicletta b3=b1; fa riferimento alla stessa area di memoria
        b1=null;
        
        Bicicletta b3= new Bicicletta();
        
        System.out.println("Numero di istanze create: "+Bicicletta.getNumeIstanzeCreate());
        //richiamo metodo statico direttamente
        System.out.println(Matematica.somma());
        
        System.out.println(Matematica.PIGRECO);
    }
    
}
