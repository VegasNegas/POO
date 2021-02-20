public class sixth {
    public static void main(String[] args) {
        int temp_1 = 0, temp_2 = 1;
        do{
            System.out.print(temp_1 + " ");
            temp_2 += temp_1;
            temp_1 += temp_2;
            System.out.print(temp_2 + " ");
        
        }while(temp_2 < 90);
    }
}
