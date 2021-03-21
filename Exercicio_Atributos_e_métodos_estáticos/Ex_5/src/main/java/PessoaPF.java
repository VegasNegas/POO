/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class PessoaPF extends Pessoa{
    String dataAniversario;
    
    PessoaPF(String nome, String cpf, String endereco, String dataAniversario){
        super(nome, cpf, endereco);
        this.dataAniversario = dataAniversario;
    }
    
    @Override
    void imprimir (){
        System.out.println("---------CPF ENCONTRADO------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.identificacao);
        System.out.println("ENDEREÇO: " + this.endereco);
        System.out.println("DATA ANIVERSARIO: " + this.dataAniversario);
        System.out.println("------------------------------------");
        System.out.println();
    }
}
