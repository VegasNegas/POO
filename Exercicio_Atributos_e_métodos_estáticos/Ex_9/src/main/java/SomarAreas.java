/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class SomarAreas {
    
    public <T> float SomarArea(T[] a){
        float total = 0;
        for(T areas : a)
            total += a.getArea();
        
        return total;
    }
   
}
