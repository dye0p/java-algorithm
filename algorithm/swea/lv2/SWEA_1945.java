package swea.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1945 {

    static int n, t;
    static int[] divide = {2, 3, 5, 7, 11};
    static int[] res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            //t_case 입력
            res = new int[5];
            t = Integer.parseInt(br.readLine());
            for (int j = 0; j < divide.length; j++) {
                while (t % divide[j] == 0) {
                    t /= divide[j];
                    res[j] += 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int result : res) {
                sb.append(result).append(" ");
            }
            System.out.println("#" + (i+1) + " " + sb);
        }
    }
}

/*
입려으로 주어지는 숫자 t가 [2, 3, 5, 7, 11] 과 모듈러 연산의 결과가 0 이면 포함될 수 있음
 */