/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Par <F, S>{
    private F v1;
    private S v2;
    
    void setValor1(F valor){
        this.v1 = valor;
    }
    void setValor2(S valor){
        this.v2 = valor;
    }

    F getValor1(F valor){
        return this.v1;
    }
    S getValor2(S valor){
        return this.v2;
    }
    

}
