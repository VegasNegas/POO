/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class FuncionarioComissinadoAssalariado extends Funcionario implements Comissao{
    double vendas = 0;
    
    FuncionarioComissinadoAssalariado(double ganho){
        this.vendas = ganho;
    }
    @Override
    double getSalario(){
        return salario+(salario*comissao)+vendas;
    }
}
