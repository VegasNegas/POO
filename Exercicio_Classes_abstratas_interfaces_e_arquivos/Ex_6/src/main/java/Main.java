/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author glauc
 */
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        try{
            FileInputStream arquivo = new FileInputStream("info.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader in = new BufferedReader(input);
            
            String line;
            do{
                line = in.readLine();
                if(line != null && line != "")
                    new Manipulacao(line);

            } while(line != null);
            arquivo.close();
            
        } catch(IOException e){
            System.out.println("Arquivo não encontrado");
        }
        System.out.println("Digite as informações");
        String text = key.nextLine();
        
        ManipulacaoSaida.escrever(text);
    }
}
