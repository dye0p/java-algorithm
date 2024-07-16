import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[21];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int tmp = 0;
            for (int j = 0; j < (b - a + 1) / 2; j++) {
                tmp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = tmp;
            }
        }

        for (int i = 1; i < 21; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
