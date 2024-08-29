package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1926 {

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            cnt = 0;
            String str = String.valueOf(i);
            if (chekc(str)) {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    static boolean chekc(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c % 3 == 0 && c != '0') {
                cnt++;
            }
        }
        if (cnt > 0) {
            return true;
        } else return false;
    }
}

