/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Pokemon {
    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int spd;
    
    void SetPokemon(int hp, int atk, int def, int spAtk, int spDef, int spd){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }
    
    void evol(int hp, int atk, int def, int spAtk, int spDef, int spd){
        this.hp += hp;
        this.atk += atk;
        this.def += def;
        this.spAtk += spAtk;
        this.spDef += spDef;
        this.spd += spd;
    }
            
    void GetPokemonStats(){
       // return(this.hp)+(this.atk);
        
        System.out.println("HP: "+this.hp);
        System.out.println("Ataque: "+this.atk);
        System.out.println("Defesa: "+this.def);
        System.out.println("SP Ataque: "+this.spAtk);
        System.out.println("SP Defesa: "+this.spDef);
        System.out.println("Speed: "+this.spd);
        
    }
}
