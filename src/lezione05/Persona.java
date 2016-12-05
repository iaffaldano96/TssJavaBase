/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author tss
 */
public class Persona {
    
    private String nome;
    private String cognome;
    private Date dataNascita;
    private String sesso;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        //this(nome,cognome,null,null);
    }
        
    public Persona(String nome, String cognome, Date dataNascita, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setSesso(String sesso) {
        if(!sesso.equals("F") || !sesso.equals("M")){
            //gestisco errore
            return;
        }
        this.sesso = sesso;
    }
    
    @Override
    public String toString(){
        return nome +" "+cognome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }
    
    /*@Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(obj.getClass() != Persona.class) //restituisce la classe dell'oggetto
            return false;
        Persona p=(Persona)obj;
        if(this.getNome().equals(p.getNome())&& this.getCognome().equals(p.getCognome()))
            return true;
        else
            return false;
    }*/
   
}
