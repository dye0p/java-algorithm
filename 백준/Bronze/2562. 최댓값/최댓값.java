import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int max = 0;       
        int num = 0;
        for(int i = 1; i<=9; i++) {
            int n = sc.nextInt();

            if(n > max) {
                max = n;
                num = i;
            }
        }

        System.out.println(max);
        System.out.println(num);
        
    }

}