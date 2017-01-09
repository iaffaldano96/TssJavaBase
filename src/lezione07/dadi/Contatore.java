/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.dadi;

import lezione03.giocodadi.*;

/**
 *
 * @author tss
 */
public class Contatore {
    
    private int valore;
    private  int passo;

    public Contatore(int valoreIni, int step) {
        valore = valoreIni;        
        passo = step;
    }
    
    public void conta(){
        valore+=passo;
    }
    
    public int valoreCorrente(){
        return valore;
    }
    
    
}
