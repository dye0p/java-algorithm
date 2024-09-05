package swea.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(br.readLine());

            int res;
            res = n / 3;

            System.out.println("#" + t + " " + res);
        }
    }
}
