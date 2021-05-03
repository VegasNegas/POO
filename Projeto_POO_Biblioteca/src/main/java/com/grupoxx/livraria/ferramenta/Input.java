/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.ferramenta;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author glauc
 */
public class Input {
    private static Scanner key = new Scanner(System.in);
    
    public static int inputInt(){
        do{
            int opc = 0;
            try{
                opc = key.nextInt();
                key.nextLine();
                return opc;
            } catch(InputMismatchException e){
                System.out.println("Escolha uma opção valida");
                //key.nextInt();
                key.nextLine();
                
            }
        }while(true);
    }

    public static int inputIntLimitado(int i){
        int opc = 0;
        do{
            try{
                opc = key.nextInt();
                if(opc >= 0 && opc <= i-1){
                    key.nextLine();
                    return opc;
                }
                else
                    System.out.printf("Escolha um numero entre 0 e %d\n", i-1);
                
                
            } catch(InputMismatchException e){
                System.out.println("Escolha uma opção valida\n");
                key.nextLine();
                //key.nextInt();
            }
        }while(true);
    }
}
