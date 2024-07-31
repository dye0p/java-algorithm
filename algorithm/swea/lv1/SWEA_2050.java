package swea.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2050 {

    static int[] arr = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for(int i=0; i<26; i++) {
            char c = str.charAt(i);
            arr[i] = c - 64;
        }
        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
