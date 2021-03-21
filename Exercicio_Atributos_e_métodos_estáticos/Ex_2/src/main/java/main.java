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
        Filho filho1 = new Filho();
        filho1.nome = "Claudia";
        filho1.idade = 32;
        filho1.mae = "Teresa";
        filho1.pai = "Heliton";
        
        System.out.println("Nome: "+filho1.nome);
        System.out.println("Idade: "+filho1.idade);
        System.out.println("Mae: "+filho1.mae);
        System.out.println("Pai: "+filho1.pai);
    }
}
