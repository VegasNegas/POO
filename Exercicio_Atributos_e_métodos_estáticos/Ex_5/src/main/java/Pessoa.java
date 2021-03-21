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
    String identificacao; //CPF OU CNPJ
    String endereco;
    
    Pessoa(String nome, String identificacao, String endereco){
        this.nome = nome;
        this.identificacao = identificacao;
        this.endereco = endereco;
    }
    
    void imprimir (){
    }
}
