/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.biblioteca;

import com.grupoxx.livraria.sistema.SalvarStatus;
import com.grupoxx.livraria.sistema.SalvarStatusException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author glauc
 */
public class LerEstante {
    
    public static Estante lerEstante() throws EstanteNaoEncontrada, IOException, ClassNotFoundException{
        Estante estante = new Estante();
        File arq = new File("Estante.arq");
        
  
        if(arq.exists()){

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Estante.arq"));
            estante = (Estante)in.readObject();
            in.close();
        }
        else{
            arq.createNewFile();
            System.out.printf("Estante não existe\nCriando uma nova estante\n");

        }
        
        return estante;
    }

    public static void salvarEstante() throws SalvarStatusException, IOException{
        Estante estante = new Estante();
        File arq = new File("Estante.arq");
        
        System.out.println("Estante não encontrada\n");
        arq.delete();
        SalvarStatus.salvarStatus(estante, "Estante.arq");
    }
}
