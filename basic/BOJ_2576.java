import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2576 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int holsu = 0;
        int min = 100;

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            if(n % 2 != 0) {
                holsu += n;
                if(n < min) {
                    min = n;
                }
            }
        }
        if(holsu != 0) {
            System.out.println(holsu);
            System.out.println(min);
        } else
            System.out.println(-1);

    }
}
