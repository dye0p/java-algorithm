package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            int result = 0;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                char c2 = str.charAt((str.length() - 1) - j);

                if (c == c2) {
                    result = 1;
                    continue;
                } else if (c != c2) {
                    result = 0;
                    break;
                }
            }
            System.out.println("#" + (i+1) + " " + result);
        }
    }
}
