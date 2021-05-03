/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.usuario;

import com.grupoxx.livraria.biblioteca.Livro;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


/**
 *
 * @author glauc
 */
public class Usuario implements Serializable{
    private String nome;
    private String senha;
    int numLivrosAlugados = 0;
    LocalDate data = LocalDate.now();
    private ArrayList<Livro> livrosAlugados = new ArrayList<Livro>();
    
    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getName(){
        return this.nome;
    }
    public String getSenha(){
        return this.senha;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
    
    public int getNumLivrosAlugados(){
        return this.numLivrosAlugados;
    }
    
    public ArrayList<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }
    
    public void adicionarLivro(Livro l){
        l.setDataDeAluguel(data);
        getLivrosAlugados().add(l);
        this.numLivrosAlugados++;
    }
    
    public void listarLivros(){
        int i = 0;
        for(Livro livros: getLivrosAlugados()){
            System.out.printf("\nID: %d | Livro: %s\n", i, livros.getNome());
            i++;
        }
    }
    
    public ListModel<String> listar2(){
        
        DefaultListModel listModel = new DefaultListModel();
        for(Livro livros: getLivrosAlugados())
            listModel.addElement(livros.getNome());
        return listModel;
    }
    
    public void listarLivrosA(){
        for(Livro livros: getLivrosAlugados()){
            System.out.printf("\nLivro: %s | Data do aluguel: %s\n", livros.getNome(), livros.getDataDeAluguel()); 
        }
    }
  
    
    public Livro devolverLivro(int opc){
        getLivrosAlugados().get(opc).setDataDeAluguel(null);
        Livro l = getLivrosAlugados().get(opc);
        getLivrosAlugados().remove(opc);
        this.numLivrosAlugados--;
        return l;
    }
    
    
    public void imprimirInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Senha: "+this.senha);
    }
    
}
