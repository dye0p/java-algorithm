package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] board;
    static boolean[][] vis;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //도화지
        board = new int[n + 2][m + 2];
        vis = new boolean[n + 2][m + 2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0; //그림 최대 넓이
        int num = 0; //그림 개수

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && !vis[i][j]) {
                    max = Math.max(max, bfs(i, j));
                    num++;
                }
            }
        }
        System.out.println(num);
        System.out.println(max);
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        vis[x][y] = true;

        int size = 1;
        while (!q.isEmpty()) {
            int[] p = q.poll();

            int px = p[0];
            int py = p[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + px;
                int ny = dy[i] + py;

                if (nx > n - 1 || ny > m - 1 || nx < 0 || ny < 0)
                    continue;

                if (vis[nx][ny])
                    continue;

                if (board[nx][ny] == 1) {
                    vis[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                    size++;
                }
            }
        }
        return size;
    }
}
