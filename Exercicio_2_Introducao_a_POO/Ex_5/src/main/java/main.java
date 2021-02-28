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
        Televisao tv = new Televisao();
        tv.mudarCanal(5);
        tv.proximoCanal();
        tv.canalAnterior();
        tv.power();
        tv.power();
        tv.mudo();
        tv.mudo();
        imprimir(tv);
        tv.power();
        imprimir(tv);
        tv.mudo();
        imprimir(tv);
    }

    static void imprimir(Televisao tv){
        System.out.println("------------------------------");
        if(tv.status == 1) System.out.println("Tv ligada");
        else System.out.println("Tv desligada");
        System.out.println(tv.canal);
        System.out.println(tv.volume);
        System.out.println("------------------------------");
    }
}
