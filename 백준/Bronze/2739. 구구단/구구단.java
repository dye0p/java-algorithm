import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for(int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
    }
}