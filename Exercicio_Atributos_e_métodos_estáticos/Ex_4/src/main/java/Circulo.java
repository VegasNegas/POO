/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Circulo extends Generic{
    Circulo(double raio){
        super(raio);
    }
    
    void imprimir(){
        System.out.println(2*Math.pow(raio, 2)+"pi");
    }
}
