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
public class Cadastrar {
      
    public static Usuario cadastraUsuario(String nome, String senha) throws UsuarioCriacaoException, IOException{
        Usuario user = null;
        
        if(!Sistema.getStatusLogin()){
            File arq = new File(nome+senha);
            user = new Usuario(nome, senha);
            if(!arq.exists()){
                Sistema.setStatusLogin(true);
               
                arq.delete();
                arq.createNewFile();

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arq));
                out.writeObject(user);
                out.close();
                System.out.printf("Bem Vindo %s\n", user.getName());
            }   
            else
                System.out.println("Usuario já existe\n");
        }
        else
            System.out.println("Usuario Logado\n");
        
        return user;
    }
}
