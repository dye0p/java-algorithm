package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            int n = Integer.parseInt(br.readLine());

            int[] score = new int[1001];

            String str = br.readLine();
            String[] s = str.split(" ");

            for (int i = 0; i < s.length; i++) {
                int num = Integer.parseInt(s[i]);
                score[num]++;
            }

            int maxCnt = 0;
            int maxNumber = 0;
            for (int i = 0; i < s.length; i++) {
                if (score[i] >= maxCnt) {
                    maxCnt = score[i];

                    if (maxNumber <= i) {
                        maxNumber = i;
                    }
                }
            }
            System.out.println("#" + n + " " + (maxNumber));
        }
    }
}
