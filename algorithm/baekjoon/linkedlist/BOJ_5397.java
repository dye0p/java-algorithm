package baekjoon.linkedlist;

/*
* 1. 테스트 n을 정수로 입력받음
* 2. '<': L_stack이 비었다면 맨앞으로 간주, 비어있지 않다면 위의 값을 꺼내어 R_stack에 삽입
* 3. '>': R_stack이 비어있지 않다면 R_stack의 값을 꺼내어 L_stack에 삽입
* 4. '$': 문자가 입력되면 L_stack에 삽입
* 5. '-': L_stack이 비어있지 않다면 맨위의 값을 삭제
* 6. 테스트 케이스의 카운트가 올라가면 Stakc을 초기화
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> L_stack = new Stack<>();
            Stack<Character> R_stack = new Stack<>();

            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                switch (c) {
                    case '<':
                        if (!L_stack.empty()) {
                            R_stack.push(L_stack.pop());
                        }
                        break;
                    case '>':
                        if (!R_stack.empty()) {
                            L_stack.push(R_stack.pop());
                        }
                        break;
                    case '-':
                        if (!L_stack.empty()) {
                            L_stack.pop();
                        }
                        break;
                    default:
                        L_stack.push(c);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();

            while (!L_stack.empty()) {
                R_stack.push(L_stack.pop());
            }
            while (!R_stack.empty()) {
                sb.append(R_stack.pop());
            }
            System.out.println(sb);
        }
        br.close();
    }
}
