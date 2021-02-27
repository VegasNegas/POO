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
        Casa casa = new Casa();
        casa.porta1.abrirPorta();
        casa.porta2.abrirPorta();
        casa.porta3.abrirPorta();
        casa.quantasPortasEstaoAbertas();
        
        casa.porta1.fecharPorta();
        casa.porta1.fecharPorta();
        casa.porta2.fecharPorta();
        casa.porta3.fecharPorta();
        casa.quantasPortasEstaoAbertas();
        casa.cor = "preto";
        casa.porta3.abrirPorta();
        casa.quantasPortasEstaoAbertas();
        
    }
}
