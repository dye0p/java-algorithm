package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1948 {

    static int test;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int sum = 0;
            if (m1 == m2) {
                sum += Math.abs(d2 - d1) + 1;
            } else {
                sum += (arr[m1 - 1] - d1);
                for (int j = m1; j < m2 - 1; j++) {
                    sum += arr[j];
                }
                sum += d2 + 1;
            }
            System.out.println("#" + (i + 1) + " " + sum);
        }
    }
}
