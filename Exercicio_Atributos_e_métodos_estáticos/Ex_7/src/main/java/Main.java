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
        DiaDaSemana dia = new DiaDaSemana();
        if(dia.ehDiaUtil("SEGUNDA"))
            System.out.println("É dia de Semana");
        else
            System.out.println("Não é dia de Semana");
        
        if(dia.ehDiaUtil("SABADO"))
            System.out.println("É dia de Semana");
        else
            System.out.println("Não é dia de Semana");
        
    
    }
}
