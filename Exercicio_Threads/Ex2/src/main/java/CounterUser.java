/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class CounterUser {
    
    public static void main(String[] args) {
        ThreadCounter t1 = new ThreadCounter("Thread 1", 20);
        ThreadCounterB t2 = new ThreadCounterB("Thread 2", 20);
    }
    
}
