package swea.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());

            int[][] board = new int[n][n];

            for (int row = 0; row < n; row++) {
                String str = br.readLine();
                for (int col = 0; col < n; col++) {
                    char c = str.charAt(col);
                    board[row][col] = Character.getNumericValue(c);
                }
            }

            int res = 0;
            int start = n / 2;
            int end = n / 2;
            for (int i = 0; i < n; i++) {
                for (int j = start; j <= end; j++) {
                    res += board[i][j];
                }
                if (i < n / 2) {
                    start -= 1;
                    end += 1;
                } else {
                    start += 1;
                    end -= 1;
                }
            }
            System.out.print("#" + test_case + " " + res);
        }
    }
}
