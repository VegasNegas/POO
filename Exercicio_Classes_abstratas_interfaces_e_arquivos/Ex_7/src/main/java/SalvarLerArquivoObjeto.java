
import java.util.ArrayList;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class SalvarLerArquivoObjeto {
    
    public static void SalvarObjeto(Object list, String nomeArq){
        File arq = new File(nomeArq);
        try{
            arq.delete();
            arq.createNewFile();
            
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(list);
            objOutput.close();
        } catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
        }
    }

    public static Funcionario LerObjeto(String nomeArq){
        Funcionario lista = new Funcionario();
        try {
            File arq = new File(nomeArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (Funcionario)objInput.readObject();
                objInput.close();
            }
        } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
        }
        
        //Funcionario novo = lista;
        
        return lista;
    }

}
