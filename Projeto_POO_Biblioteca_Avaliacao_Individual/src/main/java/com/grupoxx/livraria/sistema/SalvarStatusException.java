/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import java.io.IOException;

/**
 *
 * @author glauc
 */
public class SalvarStatusException extends Exception{
    
    SalvarStatusException(){
       super("Arquivo não existe para ser salvo"); 
    }

}
