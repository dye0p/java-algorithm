package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {

    static int n, m;
    static int[][] board;
    static boolean[][] vis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //미로크기
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n + 2][m + 2];
        vis = new boolean[n + 2][m + 2];

        //미로 입력
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j) - 48;
            }
        }

        bfs(0, 0);
        System.out.println(board[n - 1][m - 1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y}); //큐에 삽입
        vis[x][y] = true; //방문처리

        while (!q.isEmpty()) {//해당 bfs에 해당하는 큐가 비어질때까지 반복
            int[] p = q.poll();

            int px = p[0];
            int py = p[1];

            for (int i = 0; i < 4; i++) {
                //다음 좌표값
                int nx = px + dx[i];
                int ny = py + dy[i];

                //범위를 넘겼거나
                if (nx < 0 || ny < 0 || nx > n - 1 || ny > m - 1) {
                    continue;
                }

                //이미 방문했거나
                if (vis[nx][ny] && board[nx][ny] == 0) {
                    continue;
                }

                if (board[nx][ny] == 1) {
                    vis[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                    board[nx][ny] = board[px][py] + 1;
                }
            }
        }
    }
}
