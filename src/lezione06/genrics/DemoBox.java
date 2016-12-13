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
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //generics=> sono la parametrizzazione del tipo
        
        //Box box= new Box(new Persona("Mario","Rossi"));
        Box<Persona> box=new Box<>(new Persona("xxx","yyy"));
        Persona p2 = box.getObject();
        
        Box<Message> box2= new Box<>(new Message("Ciao 2")); //evito di fare il cast        
        System.out.println(box2.getObject());
        
        
        //per cambiare cognome
        if(box.getObject() instanceof Persona){
            Persona p=(Persona) box.getObject();
            p.setCognome("XXXX");
            System.out.println(box.getObject());
        }
        
        Box box1= new Box(new Message("Ciao"));
        Message msg= (Message) box1.getObject();//cast
        
    }
    
}
