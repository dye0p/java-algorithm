package baekjoon.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 스택은 마지막에 들어간것이 먼저 나오는 LIFO 구조이다
 * 스택의 시간 복잡도는 O(1)의 시간복잡도를 가진다.
 * 문자열을 스택에 추가하면 기본적으로 커서는 가장뒤에 위치하게 된다.
 * 'L': 왼쪽 스택이 비어있지 않다면 맨 위쪽 값을 pop하여 오른쪽 스택에 push
 * 'D': 오른쪽 스택이 비어있지 않다면 맨 위쪽 값을 pop하여 왼쪽 스택에 push
 * 'B': 왼쪽 스택이 비어있지 않다면 맨 위쪽 값을 지움
 * 'P $': 왼쪽스택에 $를 추가함
 * */

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String commend = br.readLine();
            char c = commend.charAt(0);

            switch (c) {
                case 'L':
                    if (!stack1.empty()) {
                        stack2.push(stack1.pop());
                    }
                    break;
                case 'D':
                    if (!stack2.empty()) {
                        stack1.push(stack2.pop());
                    }
                    break;
                case 'B':
                    if (!stack1.empty()) {
                        stack1.pop();
                    }
                    break;
                case 'P':
                    char p = commend.charAt(2);
                    stack1.push(p);
                    break;

                default:
                    break;
            }
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        StringBuilder sb = new StringBuilder();

        while (!stack2.empty()) {
            sb.append(stack2.pop());
        }
        System.out.println(sb);
    }
}
