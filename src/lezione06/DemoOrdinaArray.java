/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona arrayp[] = new Persona[4];

        Persona p1 = new Persona("Giusy", "Bianchi");
        Persona p2 = new Persona("Mario", "Rossi");
        Persona p3 = new Persona("Giusy", "Verdi");
        Persona p4 = new Persona("Giusy", "Bruni");
        arrayp[0] = p1;
        arrayp[1] = p2;
        arrayp[2] = p3;
        arrayp[3] = p4;

        System.out.println(stampa(arrayp));

        ordina2(arrayp);

        System.out.println(stampa(arrayp));

    }

    private static String stampa(Persona arrPersona[]) {
        String report = "";
        for (int i = 0; i < arrPersona.length; i++) {
            report += arrPersona[i].getNome() + " " + arrPersona[i].getCognome() + "\n";
        }
        return report;
    }

    private static void ordina(Persona arrPersona[]) {

        for (int i = 0; i<arrPersona.length-1; i++) {
            if (arrPersona[i].compareTo(arrPersona[i + 1]) > 0) {
                Persona c = arrPersona[i + 1];
                arrPersona[i + 1] = arrPersona[i];
                arrPersona[i] = c;
                i = 0;
            }
        }
    }

    private  static void ordina2(Persona arrPersona[]){
        boolean disordinato;
        do{
            disordinato=false;
            for(int i =0;i<arrPersona.length-1;i++){
                Persona c=arrPersona[i];
                Persona pNext= arrPersona[i+1];
                if(c.compareTo(pNext)>=0){
                    arrPersona[i+1]=c;
                    arrPersona[i]=pNext;
                    disordinato=true;
                }
            }
        }while(disordinato);   
     }
     
}
