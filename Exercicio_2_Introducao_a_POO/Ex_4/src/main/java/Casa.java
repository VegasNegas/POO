/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Casa {
    String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    private int quantidadePortas = 0;
    
    void quantasPortasEstaoAbertas(){
       if(porta1.status == 0){this.quantidadePortas++;}
       if(porta2.status == 0){this.quantidadePortas++;}
       if(porta3.status == 0){this.quantidadePortas++;}
       System.out.println("Portas abertas "+quantidadePortas);
       this.quantidadePortas = 0;
    }
    
    
}
