package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1288 {

    static int[] res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            res = new int[10];
            int t = Integer.parseInt(br.readLine());

            int cnt = 1;
            int b=0;
            while (true) {
                int a = cnt * t;
                b = a;
                while (b > 0) {
                    res[b % 10]++;
                    b /= 10;
                }

                int cnt2 = 0;
                for (int result : res) {
                    if (result == 0) {
                        cnt2++;
                    }
                }

                if(cnt2 == 0) {
                    System.out.println("#" + (i+1) + " " + a);
                    break;
                }
                cnt++;
            }
        }
    }
}
