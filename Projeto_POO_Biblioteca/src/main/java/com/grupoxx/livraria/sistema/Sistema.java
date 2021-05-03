/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import com.grupoxx.livraria.biblioteca.Estante;
import com.grupoxx.livraria.biblioteca.LerEstante;
import com.grupoxx.livraria.biblioteca.Livro;
import com.grupoxx.livraria.ferramenta.Input;
import com.grupoxx.livraria.usuario.Usuario;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ListModel;

/**
 *
 * @author glauc
 */
public class Sistema {
    
    private static boolean statusLogin = false;
    private static Usuario user;
    private static Estante estante;
    
    //private static ArrayList<Usuario> users = new ArrayList<Usuario>();
    public Sistema(){
        System.out.println("Iniciando Sistema...");
        estante = LerEstante.lerEstante();
    }
    
    public static void setStatusLogin(boolean s){
        statusLogin = s;
    }
    
    public static String getNomeUser(){
        return user.getName();
    }
    
    public static String getSenhaUser(){
        return user.getSenha();
    }
    
    public static int getNumLivrosAlugados(){
        return user.getNumLivrosAlugados();
    }
    
    public static boolean getStatusLogin(){
        return statusLogin;
    }
    
    public static void getInfoUser(){
        user.imprimirInfos();
    }
    

    /////////////SISTEMA
    public static boolean fazerLogin(String nome, String senha){
        user = Login.fazerLogin(nome, senha);
        if(user == null)
            return false;
        return true;
    }
    
    public static boolean cadastraUsuario(String nome, String senha){
        user = Cadastrar.cadastraUsuario(nome, senha);
        if(!statusLogin)
            return false;
        return true;
    }
    
    public static void sairConta(){
        SalvarStatus.salvarStatus(user, user.getName()+user.getSenha());
        user = null;
        statusLogin = false;
    }
    
    ////////////BIBLIOTECA
    public static void adicionarLivro(){
        if(estante == null)
            estante = new Estante();
        estante.adicionarLivro();
        SalvarStatus.salvarStatus(estante, "Estante.arq");
    }
    
    public static void listarLivros(){
        if(estante.quantidadeDeLivros() != 0){
            estante.listarLivros();
            System.out.println("\nDeseja ver a informação de algum livro ?\nSim ou não\n");
            Scanner key = new Scanner(System.in);
            String opc = key.nextLine();
            if(opc.equalsIgnoreCase("Sim") || opc.equalsIgnoreCase("s"))
                estante.lerInfoLivro();
        }
        else
            System.out.println("Nenhum livro disponivel\n");
    }
    
    public static Livro getLivroInfo(int i){
        return estante.getLivro(i);
    }
    
    public static void removerLivro(){
        if(estante.quantidadeDeLivros() != 0){
            estante.removerLivro();
            SalvarStatus.salvarStatus(estante, "Estante.arq");
            System.out.println("Livro removido com sucesso");
        }
        else
            System.out.println("Nenhum livro disponivel para ser removido");
        
    }
    
    public static void adicionarLivroIG(String nomeL, String categoria, String autor, int anoPub, int numPag, String sinopse){ //Função para Interface grafica
       estante.adicionarLivroIG(nomeL, categoria, autor, anoPub, numPag, sinopse);
       SalvarStatus.salvarStatus(estante, "Estante.arq");
    } 
    
    public static ListModel<String> getModelEstanteLivro(){ //Função para Interface grafica
        return estante.listarLivrosModel();
    }
    
    public static void removerLivroIG(int i){ //Função para Interface grafica
        estante.removerLivroIG(i);
        SalvarStatus.salvarStatus(estante, "Estante.arq");
    }
     
    /////////USUARIO
    public static Livro infoLivro(int i){
        ArrayList<Livro> livros = user.getLivrosAlugados();
        Livro l = livros.get(i);
        return l;
    }
    
    public static void alugarLivro(){
        Livro l = estante.alugarLivro();
        if(l!= null){
            user.adicionarLivro(l);
            SalvarStatus.salvarStatus(estante, "Estante.arq");
            System.out.println("Livro Alugado");
            SalvarStatus.salvarStatus(user, user.getName()+user.getSenha());
        }
        else
            System.out.println("Nenhum livro disponivel para alugar");
    }
    
    
    public static void mudarNick(String nome){
        File u = new File(user.getName()+ user.getSenha());
        u.delete();
        user.setName(nome);
        System.out.println("Deslogue para salvar as informaçoes");
    }
    
    public static void listarLivrosUsuario(){
        if(user.getNumLivrosAlugados()!= 0){
            user.listarLivrosA();
            System.out.println("");
        }
        else
            System.out.println("Nenhum livro alugado\n");
    }
    
    public static ListModel<String> getModelLivros(){
        return user.listar2();
    }
    
    public static void devolverLivro(){
        if(user.getNumLivrosAlugados() != 0){
            user.listarLivros();
            System.out.println("\nQual livro deseja devolver ?");
            estante.adicionarLivroAlugado(user.devolverLivro(Input.inputIntLimitado(user.getNumLivrosAlugados())));
            SalvarStatus.salvarStatus(estante, "Estante.arq");
            SalvarStatus.salvarStatus(user, user.getName()+user.getSenha());
        }
        else
            System.out.println("Nenhum livro alugado\n"); 
            
    }

    public static void devolverLivroIG(int i){ //Função para Interface grafica
        estante.adicionarLivroAlugado(user.devolverLivro(i));
        SalvarStatus.salvarStatus(estante, "Estante.arq");
        SalvarStatus.salvarStatus(user, user.getName()+user.getSenha());
    }
    
    public static void alugarLivroIG(int i){ //Função para Interface grafica
        Livro l = estante.alugarLivroIG(i);
        user.adicionarLivro(l);
        SalvarStatus.salvarStatus(estante, "Estante.arq");
        SalvarStatus.salvarStatus(user, user.getName()+user.getSenha());
    }
}