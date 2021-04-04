/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Servico implements Recebivel{
    String descricao;
    int horas;
    double precoHoras;
    
    Servico(String des, int h, double precH){
        this.descricao = des;
        this.horas = h;
        this.precoHoras = precH;
    }
    
    @Override
    public double totalizarReceita(){
        return horas*precoHoras;
    }
}
