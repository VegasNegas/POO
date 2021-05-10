/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.biblioteca;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author glauc
 */
public class Livro implements Serializable{
    private String nome;
    private String categoria;
    private String autor;
    private String sinopse;
    private int anoPub;
    private int numPaginas;
    private LocalDate dataDeAluguel;
    
    public Livro(String nome, String categoria, String autor, String sinopse, int anoPub, int numPaginas){
        this.nome = nome;
        this.categoria = categoria;
        this.autor = autor;
        this.sinopse = sinopse;
        this.anoPub = anoPub;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getSinopse() {
        return sinopse;
    }


    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public LocalDate getDataDeAluguel() {
        return dataDeAluguel;
    }

    public void setDataDeAluguel(LocalDate dataDeAluguel) {
        this.dataDeAluguel = dataDeAluguel;
    }
    
    public void imprimirInfoLivro(){
        System.out.printf("\nTitulo: %s\n", this.nome);
        System.out.printf("Categoria: %s\n", this.categoria);
        System.out.printf("Autor: %s\n", this.autor);
        System.out.printf("Sinopse: %s\n", this.sinopse);
        System.out.printf("Ano da publicação: %d\n", this.anoPub);
        System.out.printf("Numero de Páginas: %d\n", this.numPaginas);
    }

    
}
