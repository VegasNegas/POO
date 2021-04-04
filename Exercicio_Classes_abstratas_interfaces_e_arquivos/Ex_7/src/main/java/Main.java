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
        Funcionario glaucio = new Funcionario(1, "Glaucio", 10, 11);
        glaucio.imprimirInfos();
        
        SalvarLerArquivoObjeto.SalvarObjeto(glaucio, "Glaucio");
        Funcionario glaucio2 = SalvarLerArquivoObjeto.LerObjeto("Glaucio");
        
        glaucio2.imprimirInfos();
        
        
    }
}
