
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
public class PokemonEletrico extends Pokemon{
    private String atk1 = "EletricBall";
    private String atk2 = "Raikou";
    private String nome;
    private double peso = 55;
    private double tamanho = 1.70;
    private int xp;
    private Boolean evolucao = false;
    
    private Random gen = new Random();
    
    PokemonEletrico(String nome){
        SetPokemon(110, 40, 62, 58, 30, 60);
        this.nome = nome;
    }
    
    void evoluir(){
        if(xp >= 100 && !evolucao){
            System.out.println("EVOLUINDO.......");
            System.out.println(this.nome+" Evoluiu para "+ "Ultra "+this.nome+"\n");
            this.nome = "Ultra " + nome;
            this.peso -= 1.48;
            this.tamanho += 0.12;
            this.atk1 = "Mega " + this.atk1 + " Infinito";
            this.atk2 = "Mega " + this.atk2 + " Infinito";
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
