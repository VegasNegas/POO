/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

/**
 *
 * @author glauc
 */
public class UsuarioCriacaoException extends Exception{
    UsuarioCriacaoException(){
        super("Usuario não existe");
    }
}
