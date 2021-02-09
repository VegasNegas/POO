import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float R = keyboard.nextFloat();
        float S = keyboard.nextFloat();
        float T = keyboard.nextFloat();

        if(R > S && R > T)
            System.out.println(R);
        else if(S > T)
            System.out.println(S);
        else
            System.out.println(T);
    }
}
