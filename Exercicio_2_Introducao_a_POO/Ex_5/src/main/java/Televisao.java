/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Televisao {
    int status;
    int volume = 10;
    int canal;
    
    void power(){
        if(status == 0){System.out.println("Ligando TV"); status = 1;}
        else{System.out.println("Desligando Tv"); status = 0;}
    }
   
    void mudarCanal(int canal){
        if(canal > 0 && canal < 99)
            canal = canal;
    }

    void proximoCanal(){
        if(canal < 98)
            canal++;
    }
    
    void canalAnterior(){
        if(canal > 2)
            canal--;
    }
    
    void mudo(){
        if(volume > 0){
            volume = 0;
            System.out.println("Mudo ligado");
        }
            
        else{
            volume = 10;
            System.out.println("Mudo desligado");
        }
            
    }
}
