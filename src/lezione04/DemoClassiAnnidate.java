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
public class DemoClassiAnnidate {
    
    public static void main(String[] args) {                
        
        Persona p=new Persona("mario", "rossi");
        Persona.Indirizzo ind=new p.getIndirizzo();
        ind.setIndirizzi("via Roma");
        ind.setNumero(10);
        ind.setCap(10081);
        ind.setCitta("Ivrea");
        p.setIndirizzo(ind);
        System.out.println(p.getCognome()+", "+p.getNome()+", "+p.getIndirizzo().getCitta());
    }
    
}

class Persona{
    
    private String nome, cognome;
    private Indirizzo indirizzo;

    public Persona(String nome, String cognome ) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo=new Indirizzo(nome, 0, 0, nome);
    }

    public void setIndirizzo(Indirizzo indirizzo){
        this.indirizzo=indirizzo;
    }
    
    public Indirizzo getIndirizzo(){
        return this.indirizzo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    //altra classe annidata
    class Indirizzo{
        private String indirizzi;
        private int numero, cap;
        private String citta;

        public Indirizzo(String indirizzi, int numero, int cap, String citta) {
            this.indirizzi = indirizzi;
            this.numero = numero;
            this.cap = cap;
            this.citta = citta;
        }

        public String getIndirizzi() {
            return indirizzi;
        }

        public void setIndirizzi(String indirizzi) {
            this.indirizzi = indirizzi;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public String getCitta() {
            return citta;
        }

        public void setCitta(String citta) {
            this.citta = citta;
        }
        
        
    }
}
