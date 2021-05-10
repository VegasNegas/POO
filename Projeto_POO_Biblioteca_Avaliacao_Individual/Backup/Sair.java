/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import com.grupoxx.livraria.usuario.Usuario;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author glauc
 */
public class Sair {
    
    public static Usuario sair(Usuario user){
        File arq = new File(user.getName()+user.getSenha());
        try{
            arq.delete();
            arq.createNewFile();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arq));
            out.writeObject(user);
            out.close();
            Sistema.setStatusLogin(false);
        
        } catch(IOException e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }
        
        return user = null;
    }
}
