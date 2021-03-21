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
        PokemonFogo charmander = new PokemonFogo("charmander");
        
        charmander.imprimirStatus();
        charmander.evoluir();
        charmander.GanharXP(100);
        charmander.evoluir();
        charmander.imprimirStatus();
        charmander.evoluir();
        /*
        PokemonFogo ponita = new PokemonFogo("Ponita");
        ponita.imprimirStatus();
        ponita.GanharXP(1560);
        ponita.evoluir();
        ponita.imprimirStatus();
        */
        PokemonAgua blastoise = new PokemonAgua("Blastoise");
        blastoise.imprimirStatus();
        blastoise.GanharXP(40);
        blastoise.GanharXP(60);
        blastoise.evoluir();
        blastoise.imprimirStatus();
    
        PokemonEletrico pikachu = new PokemonEletrico("Pikachu");
        pikachu.imprimirStatus();
        pikachu.GanharXP(5000);
        pikachu.evoluir();
        pikachu.imprimirStatus();
    
    }
}
