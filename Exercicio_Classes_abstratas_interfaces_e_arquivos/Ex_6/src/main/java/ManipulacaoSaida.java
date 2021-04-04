
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class ManipulacaoSaida {
    
    static void escrever(String txt){
        try{
            FileOutputStream arq = new FileOutputStream("info.txt", true);
            PrintWriter arqW = new PrintWriter(arq);
            arqW.println(txt);
            arqW.close();
            
        } catch(IOException e){
            System.out.println("Arquivo não encontrado");
        }
    }
    
    
    
}
