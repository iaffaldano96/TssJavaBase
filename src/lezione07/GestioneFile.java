/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class GestioneFile {
    
    public static FileReader apri(String path) throws FileNotFoundException{
       
        FileReader f =new FileReader(path);        
                    
        return f;
    }
    
    public static void scrivi(String path, List<String>righe) {
        PrintWriter pw= null;
        try {
            pw = new PrintWriter(path);
            for(int i=0;i<righe.size();i++){
                String riga = righe.get(i);
                pw.println(riga);
            } 
        }
        catch (FileNotFoundException | IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
        finally {
            System.out.println("Finally call...");
            if(pw!=null)
                pw.close();
        }
    }
    
    public static void scrivi1(String path, List<String>righe) {
        try (PrintWriter pw = new PrintWriter(path)) {
            for(int i=0;i<righe.size();i++){
                String riga = righe.get(i);
                pw.println(riga);
            } 
        }
        catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Il percorso non esiste");
        }
    }
}
