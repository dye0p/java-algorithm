package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 0; t < test; t++) {
            st = new StringTokenizer(br.readLine());

            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int minute2 = Integer.parseInt(st.nextToken());

            int resHour = 0;
            int resMinute = 0;

            if (hour + hour2 > 12) {
                resHour = (hour + hour2) - 12;
            } else if (hour + hour2 < 12) {
                resHour = hour + hour2;
            }
            if (minute + minute2 > 59) {
                resMinute = (minute + minute2) - 60;
                resHour += 1;
            } else if (minute + minute2 < 59) {
                resMinute = minute + minute2;

            }
            System.out.println("#" + " " + resHour + " " + resMinute);
        }
    }
}
