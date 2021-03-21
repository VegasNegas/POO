/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */

public class DiaDaSemana{
    
    
    public enum DiaDaSemana2 {
        DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO; 
    }
    
    public Boolean ehDiaUtil(String obj){
        DiaDaSemana2[] dia = DiaDaSemana2.values();
        
        for(int i = 0; i < 7; i++){
            if(dia[i].toString() == obj && dia[i].toString() != "DOMINGO" && dia[i].toString() != "SABADO")
                return true;
        }  
        return false;     
    }
}

