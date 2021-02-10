import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int diag_d = 0, diag_e = 0;
        
        System.out.println("Qual tamanho da sua matriz ?");
        int n = keyboard.nextInt();
        int[][] matriz = new int[n][n];
        
        System.out.println("Desenhe sua Matriz \n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = keyboard.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
           diag_d += matriz[i][i];
           diag_e += matriz[i][(n-1)-i];
        }
        
        if(diag_d == diag_e) System.out.println("É uma quadrado magico");
        else System.out.println("Nao e um quadrado magico");
    }
}
