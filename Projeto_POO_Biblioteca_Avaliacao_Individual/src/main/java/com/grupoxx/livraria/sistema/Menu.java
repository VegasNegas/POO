/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoxx.livraria.sistema;

import com.grupoxx.livraria.ferramenta.Input;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author glauc
 */
public class Menu {
    private static Console console = System.console();
    private static Scanner key = new Scanner(System.in);
    private static int opc = 0;
    
    
    
    public static void menu_1(){
        
        System.out.println("");
        System.out.println("Menu");
        System.out.println(""+
        "1)Cadastrar usuario\n"+
        "2)Logar usuario\n"+
        "3)Fechar sistema\n");
        
        opc = Input.inputInt();

        switch(opc){
            case 1:
                System.out.println("Digite o nome ");
                String nome = key.nextLine();
                System.out.println("Digite a senha ");
                String senha = key.nextLine();
            {
                try {
                    Sistema.cadastraUsuario(nome, senha);
                } catch (UsuarioCriacaoException ex) {
                    ex.getMessage();
                } catch (IOException ex) {
                    System.out.println("Usuario não existe");
                }
            }
                break;


            case 2:
                System.out.println("Digite o nome ");
                String nomeL = key.nextLine();
                System.out.println("Digite a senha ");
                String senhaL = key.nextLine();
                Sistema.fazerLogin(nomeL, senhaL);
                break;
            
            case 3:
                System.exit(0);
                break;
                
            default:
                System.out.println("Escolha uma opção valida");
                break;
        }   
            
       
    }
    
    public static void menu_2(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println(""+
        "1)Informações do usuario\n"+
        "2)Ver Livros Disponiveis\n"+
        "3)Alugar Livro\n"+
        "4)Ver meus livros alugados\n"+
        "5)Devolver livro\n"+
        "6)Mudar nome\n"+
        "7)Deslogar\n");
        
        opc = Input.inputInt();
        //key.nextLine();
        try{
            switch(opc){
                case 1:
                    Sistema.getInfoUser();
                    break;

                case 2:
                    Sistema.listarLivros();
                    break;

                case 3:
                    Sistema.alugarLivro();
                    break;

                case 4:
                    Sistema.listarLivrosUsuario(); 
                    break;

                case 5:
                    Sistema.devolverLivro();
                    break;

                case 6:
                    System.out.println("Digite o novo nome");
                    String nome = key.nextLine();
                    Sistema.mudarNick(nome);
                    break;

                case 7:
                    Sistema.sairConta();
                    break;

                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            } 
        } catch(IOException ex){
            System.out.println("Não foi possivel salvar status");
        } catch(SalvarStatusException ex){
            ex.getMessage();
        }
        
    }
    
    public static void menu_3(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println(""+
        "1)Adicionar livro\n"+
        "2)Ver Livros Disponiveis\n"+
        "3)Remover um livro\n"+
        "4)Deslogar\n");
        
        opc = Input.inputInt();
        //key.nextLine();
        try{
             switch(opc){
                case 1:
                    Sistema.adicionarLivro();
                    break;

                case 2:
                    Sistema.listarLivros();
                    break;
                
                case 3:
                    Sistema.removerLivro();
                    break;
                    
                case 4:
                    Sistema.sairConta();
                    break;
                
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            } 
        } catch(IOException ex){
            System.out.println("Não foi possivel salvar status");
        } catch(SalvarStatusException ex){
            ex.getMessage();
        }
       
    }
}
