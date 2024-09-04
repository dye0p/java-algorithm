package swea.lv2;

import java.io.IOException;
import java.util.Scanner;

public class SWEA_1859 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int t = 0; t < test; t++) {
            int n = sc.nextInt();

            //매매가를 숫자로 변환하여 배열에 저장
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long maxGet = 0; //최대 이익을 담을 변수
            int max = 0; //가장 큰 매매가를 담을 변수

            //배열을 뒤에서 부터 돌면서 매매가가 가장 클 수록 max에 저장하고, max보다 작다면 차액을 계산하여 최대이익에 +
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                } else {
                    maxGet += max - arr[i];
                }
            }
            System.out.println("#" + (t + 1) + " " + maxGet);
        }
    }
}