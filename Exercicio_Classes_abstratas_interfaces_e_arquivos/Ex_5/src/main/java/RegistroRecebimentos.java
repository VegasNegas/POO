
import java.util.ArrayList;
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
public class RegistroRecebimentos {
    ArrayList<Recebivel> registros = new ArrayList<Recebivel>();
    
    void inicializarSistema(){
        System.out.println("Inicializando o sistema....1");
        int opc = 0;
        Scanner key = new Scanner(System.in);
        do{
            System.out.println("----------------------");
            System.out.println("ESCOLHA A OPÇÃO");
            System.out.println(""
                    + "1)Comprar um item\n"
                    + "2)Comprar um serviço\n"
                    + "3)Listar Valor Total da compra\n"
                    + "0)Sair"
                    + ""
                    );
            System.out.println("----------------------");
            opc = key.nextInt();
            key.nextLine();
            System.out.println("");
            switch(opc){
                case 1:
                    System.out.println("Digite a descrição do item");
                    String desc = key.nextLine();
                    System.out.println("Digite a quantidade");
                    int quant = key.nextInt();
                    System.out.println("Digite o valor");
                    double valor = key.nextDouble();
                    registros.add(new itemVenda(desc, quant, valor));
                    System.out.println("Item adicionado com sucesso\n");
                    break;
                case 2:
                    System.out.println("Digite a descrição do serviço");
                    String desc2 = key.nextLine();
                    System.out.println("Digite as horas de serviço");
                    int quant2 = key.nextInt();
                    System.out.println("Digite o valor por hora");
                    double valor2 = key.nextDouble();
                    registros.add(new Servico(desc2, quant2, valor2));
                    System.out.println("Serviço adicionado com sucesso\n");
                    break;
                case 3:
                    System.out.println("VALOR A PAGAR");
                    double total = 0;
                    for(Recebivel receita : registros){
                        total+=receita.totalizarReceita();
                    }
                    System.out.println("Total = "+total+"\n");
                    break;
                
                case 0:
                    System.out.println("Finalizando Sistema....");
                    break;
                
                default:
                    System.out.println("Escolha uma opção valida\n");
            }
        }while(opc != 0);
    }
}
    
