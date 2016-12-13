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
public class Box<T> { //dopo, al posto di scrivere Object, scrivo T dapperttutto
    
    private T object;

    public Box(T object) {
        this.object = object;
    }    

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    
    
}
