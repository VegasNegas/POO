/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class ConversaoDeUnidadesDeArea {
    static double metro = 100;
    static double peQuadrado = 30.48;
    static double milhaQuadrado = 160934;
    static double acre = 1327708;
    
    double metroParaPeQuadrado(double centimetro){
        return((centimetro*metro)/peQuadrado);
    }
    double metroParaAcres(double centimetro){
        return((centimetro*metro)/acre);
    }
    double metroParaCentimetros(double centimetro){
        return(centimetro*metro);
    }
}   
