package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int t = 0; t < test; t++) {
            st = new StringTokenizer(br.readLine());

            int[] numbers = new int[10];

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                numbers[i] = num;
            }

            Arrays.sort(numbers);

            int sum = 0;
            for (int i = 1; i < 9; i++) {
                sum += numbers[i];
            }

            double avg = (double) sum / 8;

            String result = String.format("%.0f", avg);
            System.out.println("#" + (t + 1) + " " + result);
        }
    }
}
