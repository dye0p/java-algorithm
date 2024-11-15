package swea.lv2.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1989_RE {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = br.readLine();

            int strat = 0;
            int end = str.length() - 1;
            boolean flag = false;

            for (int i = strat; i < str.length(); i++) {
                char c1 = str.charAt(strat);
                char c2 = str.charAt(end);

                if (c1 == c2) {
                    strat += 1;
                    end -= 1;
                    flag = true;
                }

                if (c1 != c2) {
                    break;
                }
            }
            if (flag) {
                System.out.println("#" + test_case + " " + 1);
            }
            if (!flag) {
                System.out.println("#" + test_case + " " + 0);
            }
        }
    }
}
