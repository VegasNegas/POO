/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.biblioteca;

import com.grupoxx.livraria.ferramenta.Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author glauc
 */
public class Estante implements Serializable{
    private ArrayList<Livro> estante = new ArrayList<Livro>();
    static Scanner key = new Scanner(System.in);
    
    public void adicionarLivro(){
        System.out.println("Digite o titulo do Livro");
        String t = key.nextLine();
        System.out.println("Digite a categoria");
        String c = key.nextLine();
        System.out.println("Digite autor");
        String a = key.nextLine();
        System.out.println("Digite o sinopse");
        String s = key.nextLine();
        System.out.println("Digite o ano da publicação");
        int anoP = Input.inputInt();
        System.out.println("Digite o numero de paginas");
        int p = Input.inputInt();
        estante.add(new Livro(t, c, a, s, anoP, p));
        System.out.println("Livro Adicionado com sucesso");  
    }
     
    public void adicionarLivroAlugado(Livro l){
        estante.add(l);
    }
    
    public void removerLivro(){
        int i = 0;
        for(Livro livros: estante){
            System.out.printf("\nID %d | Livro: %s\n", i, livros.getNome());
            i++;
        }
        if(!estante.isEmpty()){
            System.out.println("Qual livro deseja remover ?\n");  
            do{
                try{
                    int opc = Input.inputInt();
                    estante.remove(opc);
                    break;
                } catch(IndexOutOfBoundsException e){
                    System.out.println("Escolha uma opção válida:");
                    key.nextLine();
                }
            }while (true);    
        }
    }
    
    
    public Livro alugarLivro(){
        int i = 0;
        Livro l = null;
        
        for(Livro livros: estante){
            System.out.printf("\nID %d | Livro: %s\n", i, livros.getNome());
            i++;
        }
        if(!estante.isEmpty()){
            System.out.println("Qual livro deseja alugar ?\n");  
            do{
                try{
                    int opc = Input.inputInt();
                    l = estante.get(opc);
                    estante.remove(opc);
                    break;
                } catch(IndexOutOfBoundsException e){
                    System.out.println("Escolha uma opção válida:");
                    key.nextLine();
                }
            }while (true);    
        }
        return l;   
    }
    

    public void lerInfoLivro(){
        int i = 0;
        
        for(Livro livros: estante){
            System.out.printf("\nID %d | Livro: %s", i, livros.getNome());
            i++;
        }
        if(!estante.isEmpty()){
            System.out.println("\nQual livro deseja ver a informação ?");
            
            do{
                try{
                    int opc = key.nextInt();
                    estante.get(opc).imprimirInfoLivro();
                    break;
                } catch(IndexOutOfBoundsException e){
                    System.out.println("Escolha uma opção válida:");
                    key.nextLine();
                } catch(InputMismatchException e){
                    System.out.println("Escolha uma opção válida:");
                    key.nextLine();
                }
            }while(true);
            
        }
        
        key.nextLine();
    }
    
    
    public void listarLivros(){
        for(Livro livros: estante){
            System.out.printf("Livro: %s\n", livros.getNome());
        }
    }
    
    public Livro getLivro(int i){
        return estante.get(i);
    }
    
    public int quantidadeDeLivros(){
        return estante.size();
    }

    public Livro alugarLivroIG(int i){ //Função para Interface grafica
        Livro l = null;
        l = estante.get(i);
        estante.remove(i);
        return l;
    }
    
    public ListModel<String> listarLivrosModel(){ //Função para Interface grafica
        DefaultListModel listModel = new DefaultListModel();
        for(Livro livros: estante)
            listModel.addElement(livros.getNome());
        return listModel;
    }
    
    public void removerLivroIG(int i){ //Função para Interface grafica
        estante.remove(i);
    }

    public void adicionarLivroIG(String nomeL, String categoria, String autor, int anoPub, int numPag, String sinopse){ //Função para Interface grafica
        estante.add(new Livro(nomeL, categoria, autor, sinopse, anoPub, numPag));
    }
}
