/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.biblioteca;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author glauc
 */
public class SalvarEstante {
    
    public static void salvarEstante(Estante est){
        File arq = new File("Estante.arq");
          
        try{
            arq.delete();
            arq.createNewFile();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arq));
            out.writeObject(est);
            out.close();

        } catch(IOException e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }
        
        
    }
}