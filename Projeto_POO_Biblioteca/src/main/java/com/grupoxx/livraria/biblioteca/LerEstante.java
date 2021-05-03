/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.biblioteca;

import com.grupoxx.livraria.sistema.SalvarStatus;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author glauc
 */
public class LerEstante {
    
    public static Estante lerEstante(){
        Estante estante = new Estante();
        File arq = new File("Estante.arq");
        
        try{
            if(arq.exists()){
            
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("Estante.arq"));
                estante = (Estante)in.readObject();
                in.close();
            }
            else{
                arq.createNewFile();
                System.out.printf("Estante não existe\nCriando uma nova estante\n");
                
            }

        } catch(IOException e){
            System.out.println("Estante não encontrada\n");
            arq.delete();
            SalvarStatus.salvarStatus(estante, "Estante.arq");
           
        } catch(ClassNotFoundException e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }
        
        return estante;
    }
}
