/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        
        celular.fazerLigacao(4);
        celular.fazerLigacao(400);
        celular.fazerLigacao(200);
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.nivelBateria();
    }
}
