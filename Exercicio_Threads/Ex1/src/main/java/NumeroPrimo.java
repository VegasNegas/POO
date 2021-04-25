/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class NumeroPrimo {
    
    
    public static void calcularPrimo(int i, int opc){
        int a = 0;
        for(a = opc; a<i; a+=2){
            int count=0;
            for(int j = 1; j < a; j++){
                if(a%j == 0){
                    count++;
                }
            }
            if(count < 2){
                System.out.println(a);
            }
        }
        
    }
}
