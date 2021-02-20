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
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";
        pessoa1.idade = 25;
        imprimir(pessoa1);
        pessoa1.fazerAniversario();
        imprimir(pessoa1);
        pessoa1.fazerAniversario();
        imprimir(pessoa1);
        pessoa1.fazerAniversario();
        imprimir(pessoa1);
        pessoa1.fazerAniversario();
        imprimir(pessoa1);
        pessoa1.fazerAniversario();
        imprimir(pessoa1); 
    }
    
    static void imprimir(Pessoa pes){
        pes.nomePessoa();
        pes.idadePessoa();
    }
}
