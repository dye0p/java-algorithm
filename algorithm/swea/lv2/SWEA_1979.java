package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n + 1][n + 1];
            for (int row = 0; row < n; row++) {
                st = new StringTokenizer(br.readLine());

                for (int col = 0; col < n; col++) {
                    arr[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            int res = 0;

            //가로
            for (int row = 0; row < n; row++) {
                int cnt = 0;
                for (int col = 0; col < n; col++) {
                    if (arr[row][col] == 1) {
                        cnt++;
                    } else if (arr[row][col] == 0) {
                        if (cnt == k) {
                            res++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    res++;
                }
            }
            //세로
            for (int row = 0; row < n; row++) {
                int cnt = 0;
                for (int col = 0; col < n; col++) {
                    if (arr[col][row] == 1) {
                        cnt++;
                    } else if (arr[col][row] == 0) {
                        if (cnt == k) {
                            res++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    res++;
                }
            }
            System.out.println("#" + (i + 1) + " " + res);
        }
    }
}

