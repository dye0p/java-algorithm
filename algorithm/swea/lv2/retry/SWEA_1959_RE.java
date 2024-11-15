package swea.lv2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1959_RE {

    static int[] aj;
    static int[] bj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T;
        T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            aj = new int[n];
            int m = Integer.parseInt(st.nextToken());
            bj = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                aj[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                bj[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            if (n < m) {
                for (int i = 0; i <= m - n; i++) {
                    int tmp = 0;
                    for (int j = 0; j < n; j++) {
                        tmp += aj[j] * bj[i + j];
                    }
                    sum = Math.max(sum, tmp);
                }
            }

            if (n > m) {
                for (int i = 0; i <= n - m; i++) {
                    int tmp = 0;
                    for (int j = 0; j < m; j++) {
                        tmp += bj[j] * aj[i + j];
                    }

                    sum = Math.max(sum, tmp);
                }
            }

            if (n == m) {
                for (int i = 0; i < m; i++) {
                    sum += aj[i] * bj[i];
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
