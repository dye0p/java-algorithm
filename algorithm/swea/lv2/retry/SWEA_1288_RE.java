package swea.lv2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1288_RE {
    static int[] res;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            res = new int[10];

            int k = 1;
            int b = 0;
            while (true) {
                int a = k * n;
                b = a;
                while (b > 0) {
                    res[b % 10]++;
                    b /= 10;
                }
                int zeroCount = 0;
                for (int position : res) {
                    if (position == 0) {
                        zeroCount++;
                    }
                }
                if (zeroCount == 0) {
                    System.out.println("#" + test_case + " " + k);
                    break;
                }
                k++;
            }
        }
    }
}
