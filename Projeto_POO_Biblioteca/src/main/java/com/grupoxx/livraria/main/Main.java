/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.main;

import com.grupoxx.livraria.sistema.Menu;
import com.grupoxx.livraria.sistema.Sistema;


/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        
        new Sistema();
      
       
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