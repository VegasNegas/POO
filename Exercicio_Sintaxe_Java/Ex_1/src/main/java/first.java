import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int n = keyboard.nextInt();
        
        for(int i = 0; i < n; i++){
            int j  = keyboard.nextInt();
            if(j < 0){
                count++;
            }
        }
    
        System.out.println(count);
    }
}
