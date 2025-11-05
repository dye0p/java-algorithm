import java.io.*;
import java.util.*;

class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};  

    static int[][] arr;
    static boolean[][] v;
    static Queue<int[]> q;
    static int[] apart;
    static int n;
    static int areaCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[25][25];
        v= new boolean[25][25];
        apart = new int[25 * 25];
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            String[] strArr = str.split("");

            for(int j = 0; j < strArr.length; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        areaCnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1 && !v[i][j]) {
                    areaCnt++;
                    bfs(i,j);
                }
            }
        }

        System.out.println(areaCnt);
        Arrays.sort(apart);
        for(int i = 0; i < apart.length; i++) {
            if(apart[i] != 0) {
                System.out.println(apart[i]);
            }
        }
    }

    private static void bfs(int index1, int index2) {
        q = new LinkedList<>();
        
        q.offer(new int[]{index1, index2});
        v[index1][index2] = true;

        apart[areaCnt]++;
        
        while(!q.isEmpty()) {
            int[] value = q.poll();

            int x = value[0];
            int y = value[1];

            for(int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && !v[nextX][nextY] && arr[nextX][nextY] >= 1) {
                     v[nextX][nextY] = true;
                     q.offer(new int[]{nextX, nextY});
                     arr[nextX][nextY] = arr[x][y] + 1;
                     apart[areaCnt]++;
                }
             }
         }
     }
}