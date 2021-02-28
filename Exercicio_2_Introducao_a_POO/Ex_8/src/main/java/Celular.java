/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Celular {
    int capacidade = 2000;
    float bateria = capacidade;
    
    void enviarMensagem(){
        bateria--;
    }
    
    void fazerLigacao(int tempo){
        bateria -= 0.2*tempo;
    }
    
    void nivelBateria(){
        System.out.println((bateria*100)/capacidade);
    }
}
