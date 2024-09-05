package swea.lv3;

import java.util.Scanner;

public class SWEA_15941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();

            int res;
            res = n * n;

            System.out.println("#" + t + " " + res);
        }
    }
}
