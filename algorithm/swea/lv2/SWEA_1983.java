package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1983 {

    static double[] scores = {0.35, 0.45, 0.20};
    static String[] grads = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 0; t < test; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            double[] total = new double[n];
            double student = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                //점수 계산
                for (int j = 0; j < 3; j++) {
                    total[i] += scores[j] * Integer.parseInt(st.nextToken());
                }

                if (i == k - 1) {
                    student = total[i];
                }
            }
            Arrays.sort(total);

            for (int i = 0; i < total.length; i++) {
                if (total[i] == student) {
                    System.out.println("#" + (t + 1) + " " + grads[9 - i / (n / 10)]);
                }
            }
        }
    }
}