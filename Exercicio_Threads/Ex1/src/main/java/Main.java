
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Digite o valor maximo de numero primo");
        int i = key.nextInt();
        
        ThreadNumPrimo th1 = new ThreadNumPrimo("Thread 1", i, 2);
        ThreadNumPrimo th2 = new ThreadNumPrimo("Thread 2", i, 3);
       
    }
}
