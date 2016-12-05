/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Autista extends  Persona{
    
    private String patente;
    
    public Autista(String nome, String cognome, String patente) {
        super(nome, cognome);
        this.patente=patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    @Override
    public String toString(){
        //richiama con super. il metodo genitore, originale 
        //e poi aggiungo di vedere patenete
        return super.toString()+", "+patente;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Autista other = (Autista) obj;
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }
 
    
    
}
