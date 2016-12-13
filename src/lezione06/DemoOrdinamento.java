/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06;

/**
 *
 * @author tss
 */
public class DemoOrdinamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p= new Persona("Giusy", "Verdi");
        //vede metodi di Persona + compareTo
        Comparable<Persona> p1= new Persona("Giusy", "Verdi");
        //p1 vede solo il metodo compareTo
        //si può fare perché Persona implementa Comparable
        Persona p2= new Persona("Giusy", "Bianchi");             
        
        System.out.println(p1.compareTo(p2));
        
    }
    
}
