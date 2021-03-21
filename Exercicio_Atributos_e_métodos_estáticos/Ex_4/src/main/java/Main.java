/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(25, 10); // base | altura
        Circulo circulo = new Circulo(6); //raio
        
        circulo.imprimir();
        retangulo.imprimir();
    }
}
