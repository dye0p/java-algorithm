package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c - 48 == 6 || c - 48 == 9) arr[9]++; //6 || 9가 들어오면 한쪽값만 증가
            else arr[c - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9)
                arr[i] = (arr[i] + 1) / 2;
        }

        int max = 0;

        for (int i = 0; i < 10; i++)
            if (arr[i] > max) max = arr[i];

        System.out.println(max);
    }
}
