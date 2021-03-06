
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class ThreadCounter implements Runnable{
    private String name;
    private int tam;
    
    ThreadCounter(String name, int x){
        this.name = name;
        this.tam = x;
        new Thread(this, name).start();
    }
   
    @Override
    public void run() {
        int tempo; 
        try {
            for(int i = 0; i < tam; i++){
                tempo = (int)(Math.random() * 500);
                Counter.increment();
                Thread.sleep(tempo);
            }
            System.out.printf("%s Terminou de incrementar\n", Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
