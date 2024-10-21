package swea.lv2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1284_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());

            int a = 0;
            int b = 0;
            int result = 0;

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            a = p * w;

            if (w <= r) {
                b = q;
            }

            if (w > r) {
                b = (w - r) * s + q;
            }

            if (a > b) {
                result = b;
            }
            if (a < b) {
                result = a;
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}
