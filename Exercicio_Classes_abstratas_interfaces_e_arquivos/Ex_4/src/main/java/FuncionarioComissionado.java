/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class FuncionarioComissionado {
    double vendas = 0;
    
    FuncionarioComissionado(double ganho){
        this.vendas = ganho;
    }
    
    double getSalario(){
        return vendas*1.3;
    }
}
