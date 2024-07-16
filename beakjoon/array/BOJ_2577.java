package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int res = a * b * c;

        String s = String.valueOf(res);

        int[] arr = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);

            arr[n - 48]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) sb.append(arr[i]).append("\n");

        System.out.println(sb);
    }
}
