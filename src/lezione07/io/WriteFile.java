/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author tss
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        String source= "Ciao Ciao 1\nNo No 2\n";
        Files.write(Paths.get("/home/tss/nuovofile.txt"),
                source.getBytes(),
                StandardOpenOption.CREATE);
        
    }
    
}
