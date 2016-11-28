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
public class Box {
    
    private Bicicletta bici;

    public Bicicletta getBici() {
        return bici;
    }

    public void setBici(Bicicletta param) {
        param.setSpeed(0);
        this.bici = param;
    }
}
