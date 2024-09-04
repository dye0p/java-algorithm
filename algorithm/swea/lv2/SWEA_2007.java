package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            String str = br.readLine();

            int length = 0;
            boolean check = false;

            //동일한 마디 찾기
            for (int i = 1; i <= 10; i++) {
                String sep = str.substring(0, i);
                for (int j = i; j <= 30; j++) {
                    if (!str.substring(j, j + i).equals(sep)) {
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    length = sep.length();
                    break;
                }
            }
            System.out.println("#" + (t + 1) + " " + length);
        }
    }
}
