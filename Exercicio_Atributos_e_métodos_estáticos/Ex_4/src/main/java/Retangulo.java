/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Retangulo extends Generic{
    Retangulo(double base, double altura){
        super(base, altura);
    }
    
    void imprimir(){
        System.out.println(base*altura);
    }
}
