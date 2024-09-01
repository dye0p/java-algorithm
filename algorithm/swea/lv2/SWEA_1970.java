package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1970 {

    static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            int n = Integer.parseInt(br.readLine());

            int[] res = new int[8];

            for (int i = 0; i < money.length; i++) {
                res[i] = n / money[i];
                n %= money[i];
            }
            StringBuilder sb = new StringBuilder();
            Arrays.stream(res).forEach(i -> sb.append(i).append(" "));

            System.out.println("#" + (t + 1) + "\n" + sb);
        }
    }
}
