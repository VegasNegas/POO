import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(), total = 1;
        
        if(n < 0)
            System.out.println("-1");
        else{
            for(int i = n; i > 1; i--){
                total *= i;
            }
            System.out.println(total);
        }    
    }   
}
