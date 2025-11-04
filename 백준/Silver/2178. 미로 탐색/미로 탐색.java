import java.io.*;
import java.util.*;

class Main {

    static int[][] arr;
    static boolean[][] v;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};  

    static int n;
    static int m;
    static int cnt;

    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); 
        m = Integer.parseInt(st.nextToken()); 

        arr = new int[101][101];
        v = new boolean[101][101];

        for(int i = 0; i < n; i++) {
            String str = br.readLine(); 
            String[] strArr = str.split(""); 
            for(int j = 0; j < m; j++) {
                int num = Integer.parseInt(strArr[j]);
                arr[i][j] = num;
            }
        }

        bfs(0,0);
        System.out.print(arr[n - 1][m - 1]);
    }

    private static void bfs(int index1, int index2) {
        q = new LinkedList<>();
        q.offer(new int[]{index1,index2}); 
        v[index1][index2] = true; 

        while(!q.isEmpty()) {
             int[] values = q.poll();
             int x = values[0];
             int y = values[1];

            for(int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m && !v[nextX][nextY] && arr[nextX][nextY] >= 1) {
                    v[nextX][nextY] = true;
                    q.offer(new int[]{nextX, nextY}); 
                    arr[nextX][nextY] = arr[x][y] + 1;
                }
            }
        }   
    }
}