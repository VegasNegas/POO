/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Counter {
    private static int count = 0; 
    
    synchronized static void increment(){
       
        if(count < 3){
            count++;
            System.out.printf("count incrementou mais um, count = %d\n", count);
        }   
        else
            System.out.println("Esperando para incrementar");
        
    }
    
    synchronized static void decrement(){
        
        if(count > 0){
            count--;
            System.out.printf("count decrementou um, count = %d\n", count);
        }
        else    
            System.out.println("Esperando para decrementar");
       
    }
}
