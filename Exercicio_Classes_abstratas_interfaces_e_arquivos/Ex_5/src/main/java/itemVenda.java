/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class itemVenda implements Recebivel{
    String produto;
    int quantidade;
    double precoUnitario;
    
    itemVenda(String prod, int quant, double precUni){
        this.produto = prod;
        this.quantidade = quant;
        this.precoUnitario = precUni;
    }
    
    @Override
    public double totalizarReceita(){
        return quantidade*precoUnitario;
    }
}
