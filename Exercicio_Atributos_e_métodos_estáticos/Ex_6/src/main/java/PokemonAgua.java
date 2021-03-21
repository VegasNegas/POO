
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class PokemonAgua extends Pokemon{
    private String atk1 = "WaterGun";
    private String atk2 = "Surf";
    private String nome;
    private double peso = 40;
    private double tamanho = 1.22;
    private int xp;
    private Boolean evolucao = false;
    
    private Random gen = new Random();
    
    PokemonAgua(String nome){
        SetPokemon(95, 42, 60, 55, 32, 55);
        this.nome = nome;
    }
    
    void evoluir(){
        if(xp >= 100 && !evolucao){
            System.out.println("EVOLUINDO.......");
            System.out.println(this.nome+" Evoluiu para "+ "Super "+this.nome+"\n");
            this.nome = "Super " + nome;
            this.peso -= 1.48;
            this.tamanho += 0.12;
            this.atk1 = "Super " + this.atk1 + " Ultra";
            this.atk2 = "Super " + this.atk2 + " Ultra";
            evol(gen.nextInt(60), gen.nextInt(45), gen.nextInt(21), gen.nextInt(60), gen.nextInt(45), gen.nextInt(70));
            this.evolucao = true;
        }
        else
           if(xp < 100)
               System.out.println("Sem XP necessario para evoluir\n");
           else
               System.out.println(this.nome+ " já evoluido\n");
    }
    
    void GanharXP(int i){
        System.out.println(this.nome+" ganhou "+i+" de XP\n");
        xp += i;
    }
    
    void imprimirStatus(){
        System.out.println("Nome: "+this.nome);
        GetPokemonStats();
        System.out.println("Ataque 1: "+this.atk1);
        System.out.println("Ataque 2: "+this.atk2);
        System.out.println("");
    }
}