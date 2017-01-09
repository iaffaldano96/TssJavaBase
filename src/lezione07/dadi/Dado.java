/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.dadi;

import lezione03.giocodadi.*;
import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {
    
    private int numefacce;

    public Dado(int facce) {
        numefacce=facce;
    }
    
    /**
     * ritorna un num casuale tra 1 e il num di facce
     * @return 
     */
    public int lancio(){
        Random rnd= new Random();
        return rnd.nextInt(numefacce)+1;
    }
}
