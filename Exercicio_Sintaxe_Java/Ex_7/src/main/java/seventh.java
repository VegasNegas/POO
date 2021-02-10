import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pessimo = 0, ruin = 0, bom = 0, otimo = 0;  
        while(true){
            int n = keyboard.nextInt();
            if(n < 0 || n > 100){
                break;
            }
            if(n >= 0 && n <= 25) pessimo += 1; 
            if(n > 25 && n <= 50) ruin += 1; 
            if(n > 50 && n <= 75) bom += 1;
            if(n > 75 && n <=100) otimo += 1;

        }
        System.out.println("pessimo "+pessimo + "\n" + "ruin "+ruin + "\n" + "bom "+bom + "\n" + "otimo "+otimo);
    }    
}
