/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class ThreadNumPrimo implements Runnable{
    String nome;
    int i, opc;
    static NumeroPrimo calc = new NumeroPrimo();
    
    ThreadNumPrimo(String nome, int i, int opc){
        this.nome = nome;
        this.i = i;
        this.opc = opc;
        new Thread(this, nome).start();
    }
    @Override
    public void run() {
        calc.calcularPrimo(i, opc);
    }
    
}
