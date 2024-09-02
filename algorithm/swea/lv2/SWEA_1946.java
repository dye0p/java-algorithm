package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 0; t < test; t++) {
            int n = Integer.parseInt(br.readLine());

            char[] c = new char[n];
            int[] k = new int[n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                c[i] = st.nextToken().charAt(0);
                k[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k[i]; j++) {
                    System.out.print(c[i]);
                    cnt++;

                    if (cnt == 10) {
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
