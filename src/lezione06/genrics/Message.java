/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.genrics;

/**
 *
 * @author tss
 */
public class Message {
    
    private String testo;

    public Message(String testo) {
        this.testo = testo;
    }    
    
    @Override
    public String toString() {
        return "Message{" + "testo=" + testo + '}';
    }

    public String getTesto() {
        return testo;
    }
    
    
    
}
