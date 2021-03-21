/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class PessoaPJ extends Pessoa{
    double faturamento;
    
    PessoaPJ(String nome, String cnpj, String endereco, double faturamento){
        super(nome, cnpj, endereco);
        this.faturamento = faturamento;
    }
    
    //System.out.println(this.identificacao);
    
    @Override
    void imprimir (){
        System.out.println("---------CNPJ ENCONTRADO------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("CNPJ: " + this.identificacao);
        System.out.println("ENDEREÇO: " + this.endereco);
        System.out.println("FATURAMENTO: " + this.faturamento);
        System.out.println("------------------------------------");
        System.out.println();
    }
}
