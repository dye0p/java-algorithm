import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j =0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}