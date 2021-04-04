/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Bicicleta implements CarbonFootprint{
    boolean marcha = true;
    
    Bicicleta(boolean marcha){
        this.marcha = marcha;
    }
    public int getCarbonFootprint(){
        int polui = 0;
        
        if(!marcha)
            polui++;
        
        return polui;
    }
    
    public void getInfo(){
        System.out.println("Bicicleta");
        if(marcha)
            System.out.println("Bike com marcha");
        else
            System.out.println("Bike sem marcha");
    }
}
