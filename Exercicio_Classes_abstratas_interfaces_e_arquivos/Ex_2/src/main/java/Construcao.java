/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Construcao implements CarbonFootprint{
    int numPessoas;
    int numLampada;
    boolean usoEnergia = true;
    boolean usoArCondicionado = true;
    
    Construcao(int numP, int numL, boolean usoE, boolean usoA){
        this.numPessoas = numP;
        this.numLampada = numL;
        this.usoEnergia = usoE;
        this.usoArCondicionado = usoA;
    }
    
    @Override
    public int getCarbonFootprint(){
        int polui = 0;
        
        polui += numPessoas;
        if(usoEnergia){
            polui+=numLampada;
            if(usoArCondicionado)
                polui+=2;
        }
        return polui;
    }

    public void getInfo(){
        System.out.println("Construção");
        System.out.println("Numero de pessoa "+this.numPessoas);
        System.out.println("Numero de lampadas "+this.numLampada);
        if(usoEnergia)
            System.out.println("Energia Ligada");
        else
            System.out.println("Energia Desligada");
        if(usoArCondicionado)
            System.out.println("ArCondicionado Ligado");
        else
            System.out.println("ArCondicionado Desligado");
        
    }
}
