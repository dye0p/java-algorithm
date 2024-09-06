package swea.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {

            int n = Integer.parseInt(br.readLine());
            int[] building = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                building[i] = Integer.parseInt(st.nextToken());
            }
            int res = 0;
            for (int i = 2; i < n - 2; i++) {
                int left = Math.max(building[i - 1], building[i - 2]);
                int right = Math.max(building[i + 1], building[i + 2]);
                int max = Math.max(left, right);

                if (building[i] > max) {
                    res += (building[i] - max);
                }
            }
            System.out.println("#" + test_case + " " + res);
        }
    }
}
