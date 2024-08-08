package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = 0;
            int b = 0;

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            a = p * w;

            if (w < r) b = q;

            else if (w > r) {
                int over = w - r;
                b = (over * s) + q;
            }

            if (a > b) System.out.println("#" + (i + 1) + " " + b);
            else if (a < b) System.out.println("#" + (i + 1) + " " + a);
        }
    }
}
