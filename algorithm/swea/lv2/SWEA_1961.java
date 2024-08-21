package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());

            //배열 입력
            int[][] arr = new int[n][n];

            for (int row = 0; row < n; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col = 0; col < n; col++) {
                    arr[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr_90 = rotate(arr);
            int[][] arr_180 = rotate(arr_90);
            int[][] arr_270 = rotate(arr_180);

            System.out.println("#" + (i + 1));
            for (int row = 0; row < arr.length; row++) {

                for (int col = 0; col < arr.length; col++) {
                    System.out.print(arr_90[row][col]);
                }
                System.out.print(" ");

                for (int col = 0; col < arr.length; col++) {
                    System.out.print(arr_180[row][col]);
                }
                System.out.print(" ");

                for (int col = 0; col < arr.length; col++) {
                    System.out.print(arr_270[row][col]);
                }
                System.out.println();
            }
        }
    }

    public static int[][] rotate(int[][] arr) {
        int[][] res = new int[arr.length][arr.length];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                res[row][col] = arr[arr.length - 1 - col][row];
            }
        }

        return res;
    }
}