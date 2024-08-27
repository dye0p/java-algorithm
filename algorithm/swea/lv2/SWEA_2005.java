package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            int n = Integer.parseInt(br.readLine());

            int[][] pascal = new int[n + 1][n + 1];

            pascal[0][1] = 1;

            for (int row = 1; row < pascal.length - 1; row++) {
                for (int col = 1; col <= row + 1; col++) {
                    pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
                }
            }

            System.out.println("#" + (t + 1));
            for (int i = 0; i < pascal.length - 1; i++) {
                for (int j = 1; j < pascal.length; j++) {
                    if (pascal[i][j] == 0) {
                        continue;
                    }
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}