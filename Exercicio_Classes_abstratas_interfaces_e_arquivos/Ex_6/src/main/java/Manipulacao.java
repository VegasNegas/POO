/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Manipulacao {
    private int dia, IdPluvi;
    private double tempMax, tempMin;
    
 
    
    Manipulacao(String str){
        String[] linha = str.split(" ");
        this.dia = Integer.parseInt(linha[0]);
        this.tempMax = Double.parseDouble(linha[1]);
        this.tempMin = Double.parseDouble(linha[2]);
        this.IdPluvi = Integer.parseInt(linha[3]);   
        imprimirInfos();
    }
    
   void imprimirInfos(){
        System.out.println("Dia "+this.dia);
        System.out.println("Temperatura maxima "+this.tempMax);
        System.out.println("Temperatura minima "+this.tempMin);
        System.out.println("Indice Pluviométrico "+this.IdPluvi);
        System.out.println("");
    }  
}
