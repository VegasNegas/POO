/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import com.grupoxx.livraria.usuario.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author glauc
 */
public class Login {
    
    public static Usuario fazerLogin(String nome, String senha){
        Usuario user = null;
        try{
            File arq = new File(nome+senha);
            
            if(arq.exists()){
                if(!Sistema.getStatusLogin()){
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(nome+senha));
                    user = (Usuario)in.readObject();
                    in.close();
                    Sistema.setStatusLogin(true);
                    System.out.printf("Bem Vindo %s\n", user.getName());
                }
                else
                    System.out.printf("Usuario já logado\n");
            }
            else
                System.out.printf("Usuario ou senha incorreto\n");
        } catch(IOException e){
            System.out.println("Usuario ou senha incorreto\n");
        } catch(ClassNotFoundException e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }
        
        return user;
    }
}
