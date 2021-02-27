/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Porta {
    int status = 0;
    String[] status1 = {"Aberta", "Fechada"};

    void abrirPorta(){
        if(status== 0) System.out.println("Porta Já Aberta");
        else status = 0;
    }
    void fecharPorta(){
        if(status== 1) System.out.println("Porta Já Fechada");
        else status = 1;
    }
    void estaAberta(){
        System.out.println("Porta está " + status1[status]);
    }
}