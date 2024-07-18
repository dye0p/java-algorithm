package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {

    static int n, x, cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());

        func(arr);
    }

    public static void func(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
