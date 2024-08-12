package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1959 {

    static int test;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        test = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());

            //n, m 입력 (길이)
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            //배열 길이 초기화
            int[] narr = new int[n];
            int[] marr = new int[m];

            //n 배열 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                narr[j] = Integer.parseInt(st.nextToken());
            }

            //m 배열 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                marr[j] = Integer.parseInt(st.nextToken());
            }

            //합 계산
            //3가지 경우의 수가 있음
            int sum = 0;
            if (n < m) {
                for (int j = 0; j < m - n + 1; j++) {
                    int tmp = 0;
                    for (int k = 0; k < n; k++) {
                        tmp += narr[k] * marr[j + k]; //합계
                    }
                    sum = Math.max(sum, tmp); //최대값
                }
            } else if (n > m) {
                for (int j = 0; j < n - m + 1; j++) {
                    int tmp = 0;
                    for (int k = 0; k < m; k++) {
                        tmp += marr[k] * narr[j + k];
                    }
                    sum = Math.max(sum, tmp);
                }
            } else {
                int tmp = 0;
                for (int j = 0; j < n; j++) {
                    tmp += narr[j] * marr[j];
                }

                sum = Math.max(sum, tmp);
            }
            System.out.println("#" + (i+1) + " " + sum);
        }
    }
}
