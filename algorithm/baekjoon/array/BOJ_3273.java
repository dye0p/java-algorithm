package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {

    static int n, x, cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());

        func(arr);
    }

    public static void func(int[] arr) {
        Arrays.sort(arr);

        int right = n - 1;
        int reft = 0;

        while (right > reft) {
            if (arr[reft] + arr[right] > x) {
                right--;
            } else if (arr[reft] + arr[right] < x) {
                reft++;
            } else {
                reft++;
                right--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
