import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if (n % 4 == 0 && n % 100 != 0) { //4의 배수이면서 100의 배수가 아닐때
            System.out.println("1");
        } else if (n % 4 == 0 && n % 400 == 0) { //4의 배수이면서 400의 배수일때
            System.out.println("1");
        } else System.out.println("0");

    }
}
