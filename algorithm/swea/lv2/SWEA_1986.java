package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1986 {

    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int sum = 0;
            m = Integer.parseInt(br.readLine());
            for (int j = 1; j <= m; j++) {
                if (j % 2 == 0) {
                    sum -= j;
                } else {
                    sum += j;
                }
            }
            System.out.println("#" + (i + 1) + " " + sum);
        }
    }
}
