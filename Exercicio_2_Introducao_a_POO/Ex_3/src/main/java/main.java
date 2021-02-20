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
        Porta porta = new Porta();
        porta.cor = "Branco";
        porta.dimensao = 12;
        imprimirPorta(porta);
        
        porta.dimensao = 10;
        porta.cor = "Azul";
        porta.abrirPorta();
        imprimirPorta(porta);
        
        porta.dimensao = 5;
        porta.cor = "Preto";
        porta.fecharPorta();
        imprimirPorta(porta);
    }
    
    static void imprimirPorta(Porta porta){
        System.out.println("A cor da porta é " + porta.cor);
        porta.estaAberta();
        System.out.println("A dimensao da porta é " + porta.dimensao);
        System.out.println("");
    }
}
