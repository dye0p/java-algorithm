import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i =0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<5; i++) {
            sum += (arr[i] * arr[i]);
        }

        System.out.println(sum % 10);
    }
}