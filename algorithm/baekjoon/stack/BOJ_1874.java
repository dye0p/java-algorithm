package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int cnt = 1;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (cnt <= x) {
                for (int j = cnt; j <= x; j++) {
                    stack.push(cnt++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");

            } else if (stack.peek() == x) {
                stack.pop();
                sb.append("-").append("\n");
            } else if (stack.peek() > x) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
