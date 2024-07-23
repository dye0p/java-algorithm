package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            switch (s) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;

                case "pop":
                    if (!stack.empty()) {
                        System.out.println(stack.pop());
                    } else System.out.println(-1);
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.empty()) {
                        System.out.println(1);
                    } else
                        System.out.println(0);
                    break;

                case "top":
                    if (!stack.empty()) {
                        System.out.println(stack.peek());
                    }else
                        System.out.println(-1);
                    break;

                default:
                    break;
            }
        }

    }
}
