/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Primo software started...");
        String frase=JOptionPane.showInputDialog("Inserisci la frase da stampare:");
        System.out.println(frase);
    }
}
