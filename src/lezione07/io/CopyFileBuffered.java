/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tss
 */
public class CopyFileBuffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        
        
        try(BufferedReader br=new BufferedReader(new FileReader("/home/tss/scrivi.txt"));
                BufferedWriter bw= new BufferedWriter(new FileWriter("/home/tss/prova.txt"))){
            
            String riga;
            while((riga=br.readLine())!=null){
                bw.write(riga);
                bw.newLine(); //  a ogni riga vado a capo
            }
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());            
        }
        
        
    }
    
}
