/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Carro implements CarbonFootprint{
    String combustivel;
    float cilindrada;
    
    Carro(String comb, float cilin){
        this.combustivel = comb;
        this.cilindrada = cilin;
    }
    
    @Override
    public int getCarbonFootprint(){
        int polui = 0;
        if(this.combustivel == "Gás")
            polui += 2;
        
        else if(this.combustivel == "Etanol")
            polui += 4;
        
        else if(this.combustivel == "Gasolina")
            polui += 5;
        
        return polui;
    }

    public void getInfo(){
        System.out.println("Carro");
        System.out.println("Tipo de combustivel: "+this.combustivel);
        System.out.println("Cilindradas: "+this.cilindrada);
    }
}
