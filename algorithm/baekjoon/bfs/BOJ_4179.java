package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_4179 {
    static int n, m;

    static char[][] board;
    static int[][] vis1;
    static int[][] vis2;

    static Queue<int[]> qj;
    static Queue<int[]> qf;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new char[n + 2][m + 2];
        vis1 = new int[n + 2][m + 2];
        vis2 = new int[n + 2][m + 2];

        qj = new ArrayDeque<>();
        qf = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                vis1[i][j] = -1;
                vis2[i][j] = -1;
                char c = str.charAt(j);
                board[i][j] = c;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'J') {
                    qj.offer(new int[]{i, j});
                    vis1[i][j] = 0;
                }
                if (board[i][j] == 'F') {
                    qf.offer(new int[]{i, j});
                    vis2[i][j] = 0;
                }
            }
        }

        bfs_f();
        bfs_j();
    }

    static void bfs_f() {
        while (!qf.isEmpty()) {
            int[] p = qf.poll();

            int px = p[0];
            int py = p[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx < 0 || ny < 0 || nx > n - 1 || ny > m - 1) {
                    continue;
                }
                //불이 이미 퍼졌거나 벽이 있는 경우
                if (vis2[nx][ny] >= 0 || board[nx][ny] == '#') {
                    continue;
                }

                qf.offer(new int[]{nx, ny});
                vis2[nx][ny] = vis2[px][py] + 1;
            }
        }
    }

    static void bfs_j() {
        while (!qj.isEmpty()) {
            int[] p = qj.poll();

            int px = p[0];
            int py = p[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx < 0 || ny < 0 || nx > n - 1 || ny > m - 1) {
                    System.out.println(vis1[px][py] + 1);
                    return;
                }

                if (vis1[px][py] + 1 >= vis2[nx][ny]) {
                    continue;
                }

                if (board[nx][ny] == '#' || vis1[nx][ny] >= 0) {
                    continue;
                }

                qj.offer(new int[]{nx, ny});
                vis1[nx][ny] = vis1[px][py] + 1;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}



/*
 * 벽은 통과하지 못한다.
 * 미로의 가장자리에 접한 공간에서 탈출할 수 있다.
 * J에는 지훈이의 초기 위치
 * F는 불이난 곳
 *
 *
 * 지훈이가 탈출할 수 있는 경우: 불이 타는속도보다 지훈이가 같거나 빠를때
 * 지훈이가 탈출할 수 없는 경우: 지훈이의 속도보다 불이타는 속도가 빠를때
 * 지훈이와 불은 1분마다 동시에 움직인다.
 * 지훈이가 가장자리에 도착했다면 탈출할 수 있음
 * 탈출시간은 지훈이가 이동한 시간 + 1
 *
 * 불과 지훈이의 bfs를 따로 돌려야함
 * */
