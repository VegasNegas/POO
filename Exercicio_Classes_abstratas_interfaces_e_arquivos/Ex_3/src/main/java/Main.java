
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
        
        Construcao construcao1 = new Construcao(4,6,false,true);
        Construcao construcao2 = new Construcao(2,4,true,true);
        
        Carro carro1 = new Carro("Gás", 1000);
        Carro carro2 = new Carro("Gasolina", 1200);
        
        Bicicleta bike1 = new Bicicleta(true);
        Bicicleta bike2 = new Bicicleta(false);
        
        lista.add(construcao1);
        lista.add(construcao2);
        lista.add(carro1);
        lista.add(carro2);
        lista.add(bike1);
        lista.add(bike2);
        
        for(CarbonFootprint objs : lista){
            objs.getInfo();
            System.out.println("Numero de pegadas do carbono: " + objs.getCarbonFootprint()+"\n");
            
        }
    }
    
    //a) funciona
    
}
