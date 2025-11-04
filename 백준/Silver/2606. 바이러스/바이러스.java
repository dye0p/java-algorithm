import java.io.*;
import java.util.*;

class Main {

    static int[][] arr;
    static boolean[] v;
    static int cnt;
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[101][101];
        v = new boolean[101];
        
        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");

            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            arr[a][b] = arr[b][a] = 1;
        }
        
        bfs(1);
        System.out.println(cnt - 1);
    }
    
    private static void bfs(int index) {
        Queue<Integer> q = new LinkedList<>();
        v[index] = true;
        q.offer(index);

        while(!q.isEmpty()) {
            int value = q.poll();
            cnt++;
            for(int i = 1; i <= n; i++) {
                if(arr[value][i] == 1 && !v[i]) {
                    q.offer(i);
                    v[i] = true;
                }
            }
        }
    }
}