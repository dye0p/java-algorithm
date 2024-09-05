package swea.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_12368 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 1; t <= test; t++) {
            st = new StringTokenizer(br.readLine());

            int hour1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());

            int res = 0;

            if ((hour1 + hour2) % 24 == 0) {
                res = 0;
            } else if ((hour1 + hour2) < 24) {
                res = hour1 + hour2;
            } else if ((hour1 + hour2) > 24) {
                res = (hour1 + hour2) - 24;
            }
            System.out.println("#" + t + " " + res);
        }
    }
}
