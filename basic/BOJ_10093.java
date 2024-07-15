import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        if(n > m) {
            long tmp = n;
            n = m;
            m = tmp;
        }

        if (n == m) {
            System.out.println(0);
            return;
        }

        System.out.println(m - n - 1);
        for (long i = n + 1; i < m; i++) {
            System.out.print(i + " ");
        }
    }
}
