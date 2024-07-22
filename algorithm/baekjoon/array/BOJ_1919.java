package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];

        int cnt = 0;

        for (int i = 0; i < s1.length(); i++)
            alphabet1[s1.charAt(i) - 97]++;
        for (int i = 0; i < s2.length(); i++)
            alphabet2[s2.charAt(i) - 97]++;

        for (int i = 0; i < alphabet1.length; i++)
            cnt += Math.abs(alphabet1[i] - alphabet2[i]);

        System.out.println(cnt);
    }
}
