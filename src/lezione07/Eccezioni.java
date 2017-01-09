/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 *
 * @author tss
 */
public class Eccezioni {
    
    public static void main(String[] args) {        

        String[] righe= {"Ciao a tutti.","Tra poco caffè.","Ci vediamo più tardi."};
        
        try{
        GestioneFile.scrivi("/tmp/scrivi.txt",Arrays.asList(righe));
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Qualcosa è andato storto.");
            System.out.println(e.getClass());
        }
        
    }
}