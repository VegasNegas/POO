/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.main;

import com.grupoxx.livraria.biblioteca.EstanteNaoEncontrada;
import com.grupoxx.livraria.biblioteca.LerEstante;
import com.grupoxx.livraria.sistema.Menu;
import com.grupoxx.livraria.sistema.Sistema;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            new Sistema();
        } catch (IOException ex) {
            System.out.println("Estante não existe na versao correta, criando uma nova");
            LerEstante.salvarEstante();
        } catch (EstanteNaoEncontrada ex) {
            ex.getMessage();
        } catch (ClassNotFoundException ex) {
            System.out.printf("Erro: %s\n", ex.getMessage());
        }
      
       
        while(true){
            if(!Sistema.getStatusLogin())
                Menu.menu_1();
            else{
                if(Sistema.getNomeUser().equalsIgnoreCase("admin") && Sistema.getSenhaUser().equalsIgnoreCase("admin"))
                    Menu.menu_3();

                else Menu.menu_2();
                        
            }
        }
    }
}