/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class FuncionarioHoraExtra extends Funcionario{
    double horas= 0;
    
    FuncionarioHoraExtra(double h){
        this.horas = h;
    }
    
    @Override
    double getSalario(){ 
        
        return salario+(horas*1.5);
    }
}
