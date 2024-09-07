package swea.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int dump = Integer.parseInt(br.readLine());

            int[] box = new int[100];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < dump; i++) {
                Arrays.sort(box);

                box[99] -= 1;
                box[0] += 1;
            }
            Arrays.sort(box);
            int res = box[99] - box[0];

            System.out.println("#" + test_case + " " + res);
        }
    }
}