package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1954 {

    static int[] dr = { 0, 1, 0, -1 };
    static int[] dc = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];

            int row = 0;
            int col = 0;
            int dir = 0;

            for (int j = 1; j <= n * n; j++) {
                arr[row][col] = j;

                if (row + dr[dir] >= n || row + dr[dir] < 0 || col + dc[dir] >= n || col + dc[dir] < 0
                        || arr[row + dr[dir]][col + dc[dir]] != 0) {
                    dir = (dir + 1) % 4;
                }
                row += dr[dir];
                col += dc[dir];

            }

            System.out.println("#" + (i + 1));
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }

        }
    }
}
