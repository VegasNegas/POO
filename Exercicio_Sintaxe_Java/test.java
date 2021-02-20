public class test {
    public static void main(String[] args) {
        long result = 1;
        
        for(int i = 2; i < 50; i++){
            if(i % 2 == 0  && i != 2 || i % 3 == 0 && i != 3 || i % 5 == 0 && i != 5  || i % 7 == 0 && i != 7) continue;
            System.out.println(i);
            result *= i;
        }
        System.out.println(result);
    }
}
