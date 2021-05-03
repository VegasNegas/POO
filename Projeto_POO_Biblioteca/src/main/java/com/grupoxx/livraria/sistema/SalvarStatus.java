/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author glauc
 */
public class SalvarStatus {
    
    public static void salvarStatus(Object obj, String nomeArquivo){
        File arq = new File(nomeArquivo);
        
        try{
            arq.delete();
            arq.createNewFile();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arq));
            out.writeObject(obj);
            out.close();
        } catch(IOException e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }
    }
}
