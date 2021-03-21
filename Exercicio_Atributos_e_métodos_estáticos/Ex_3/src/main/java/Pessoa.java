/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Pessoa {
    String nome;
    int idade;
    Pessoa pai;
    Pessoa mae;

    Pessoa(String nome, int idade, String pai, String mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = new Pessoa(pai, 40);
        this.mae = new Pessoa(mae, 55);
        
    }
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.pai = new Pessoa("Claudio", 56);
        this.mae = new Pessoa("Claudia", 66);
    }
}
