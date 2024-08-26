package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 0; t < test; t++) {

            int[][] board = new int[9][9];

            for (int row = 0; row < 9; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col = 0; col < 9; col++) {
                    board[row][col] = Integer.parseInt(st.nextToken());
                }
            }
            int result = 1;

            //가로
            for (int row = 0; row < 9; row++) {
                int[] numbers = new int[9];
                for (int col = 0; col < 9; col++) {
                    numbers[board[row][col] - 1]++;
                }

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] != 1) {
                        result = 0;
                        break;
                    }
                }
            }

            //세로
            for (int row = 0; row < 9; row++) {
                int[] numbers = new int[9];
                for (int col = 0; col < 9; col++) {
                    numbers[board[col][row] - 1]++;
                }
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] != 1) {
                        result = 0;
                        break;
                    }
                }
            }

            //3x3
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int[] numbers = new int[9];
                    for (int row = 0; row < 3; row++) {
                        for (int col = 0; col < 3; col++) {
                            numbers[board[i + row][j + col] - 1]++;
                        }
                    }

                    for (int k = 0; k < numbers.length; k++) {
                        if (numbers[k] != 1) {
                            result = 0;
                            break;
                        }
                    }
                }
            }
            System.out.println("#" + (t + 1) + " " + result);
        }
    }
}
