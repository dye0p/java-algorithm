package swea.lv2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1945_RE {

    static int[] res;
    static int[] divide = {2, 3, 5, 7, 11};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            res = new int[5];

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < divide.length; i++) {
                while (n % divide[i] == 0) {
                    n /= divide[i];
                    res[i] += 1;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int result : res) {
                sb.append(result).append(" ");
            }
            System.out.println("#" + test_case + " " + sb);
        }
    }
}
