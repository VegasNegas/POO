
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Funcionario implements Serializable{
    int Registro;
    String nome;
    int numDepartamento;
    int numDepartamentoG; //numero departamento gerenciado
    Funcionario(){}
    
    Funcionario(int reg, String nome, int numD, int numDG){
        this.Registro = reg;
        this.nome = nome;
        this.numDepartamento = numD;
        this.numDepartamentoG = numDG;
    }

    void imprimirInfos(){
        System.out.println("Registro: "+this.Registro);
        System.out.println("Nome: "+this.nome);
        System.out.println("Numero departamento: "+this.numDepartamento);
        System.out.println("Numero departamento gerenciado: "+this.numDepartamentoG+"\n");
    }
}
