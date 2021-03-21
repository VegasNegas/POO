
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class main {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new PessoaPF("Glaucio", "17759508751" , "Av rio branco dos dragoes", "12/04/1997")); //nome |cpf |endereço |data de nascimento
        pessoas.add(new PessoaPJ("Empresa LTDA", "89.086.144/0001-16", "Ac rio de paulo dois tres dois", 25.0)); //nome| cnpj| endereço| faturamento
        
        for(Pessoa p : pessoas){
            if(p.identificacao == "17759508751"){ //Aqui é só colocar a entrada de uma String e comparar 
                p.imprimir();
            }
            if(p.identificacao == "89.086.144/0001-16"){
                p.imprimir();
            }
            
        }
    }
    
    
}
