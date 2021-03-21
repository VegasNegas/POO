
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
public class PokemonFogo extends Pokemon{
    private String atk1 = "Bola de Fogo";
    private String atk2 = "Lança-Chamas";
    private String nome;
    private double peso = 60;
    private double tamanho = 1.42;
    private int xp;
    private Boolean evolucao = false;
    
    private Random gen = new Random();
    
    PokemonFogo(String nome){
        SetPokemon(100, 50, 40, 35, 20, 35);
        this.nome = nome;
    }
    
    void evoluir(){
        if(xp >= 100 && !evolucao){
            System.out.println("EVOLUINDO.......");
            System.out.println(this.nome+" Evoluiu para "+ this.nome+" Mega\n");
            this.nome = nome + " Mega";
            this.peso -= 2.51;
            this.tamanho += 0.15;
            this.atk1 = "Ultimate " + this.atk1 + " Ultra";
            this.atk2 = "Ultimate " + this.atk2 + " Ultra";
            evol(gen.nextInt(100), gen.nextInt(50), gen.nextInt(15), gen.nextInt(60), gen.nextInt(20), gen.nextInt(74));
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
