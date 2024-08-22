package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine()); //돌을 던진 사람

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine()); //돌을 던진 위치

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Math.abs(Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(arr);

            int min = arr[0];
            int cnt = 1;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == min) {
                    cnt++;
                } else break;
            }
            System.out.println("#" + (i + 1) + " " + min + " " + cnt);
        }
    }
}
