import java.io.*;
import java.util.*;

class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};  

    static int[][] arr;
    static boolean[][] v;
    static int n,m,k;
    static Queue<int[]> q;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String a = br.readLine();

            String[] aArr = a.split(" ");
            
            m = Integer.parseInt(aArr[0]); //10
            n = Integer.parseInt(aArr[1]); //8
            k = Integer.parseInt(aArr[2]); //17

            arr = new int[51][51];
            v = new boolean[51][51];

            for(int j = 0; j < k; j++) {
                String str = br.readLine();
                String[] strArr = str.split(" ");

                arr[Integer.parseInt(strArr[0])][Integer.parseInt(strArr[1])] = 1;
            }

            cnt = 0;
            for(int j = 0; j < m; j++) {
                for(int h = 0; h < n; h++) {
                    if(arr[j][h] == 1 && !v[j][h]) {
                        bfs(j, h);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void bfs(int index1, int index2) {
        q = new LinkedList<>();

        q.offer(new int[]{index1, index2});
        v[index1][index2] = true;

        while(!q.isEmpty()) {
            int[] value = q.poll();

            int x = value[0];
            int y = value[1];

            for(int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n && !v[nextX][nextY] && arr[nextX][nextY] == 1) {
                    q.offer(new int[]{nextX, nextY});
                    v[nextX][nextY] = true;
                }
            }
        }
    }
}