package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {

    static Queue<int[]> q;
    static int m, n;
    static int[][] tomato;
    static boolean[][] vis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        tomato = new int[n + 2][m + 2];
        vis = new boolean[n + 2][m + 2];

        q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        bfs();

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    System.out.println(-1);
                    return;
                } else {
                    max = Math.max(tomato[i][j], max);
                }
            }
        }
        System.out.println(max - 1);
    }

    static void bfs() {

        while (!q.isEmpty()) {
            int[] p = q.poll();

            int px = p[0];
            int py = p[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx < 0 || ny < 0 || nx > n - 1 || ny > m - 1) {
                    continue;
                }

                if (tomato[nx][ny] == 0) {
                    q.offer(new int[]{nx, ny});
                    vis[nx][ny] = true;
                    tomato[nx][ny] = tomato[px][py] + 1;
                }
            }
        }
    }
}



/*
 * 1. 익은 토마토 =1 , 안 익은 토마토 =0, 토마토가 들어있지 않은 칸 -1
 * 2. 대각선을 제외한 상하좌우에 익은 토마토가 있다면 안익은 토마토는 익는다
 * 3. 모든 토마토가 다 익는데 걸리는 최소 일수를 구해야함
 * 4. 저장될 때부터 모든 토마토가 익은 상태이면 0을 출력
 * 5. 토마토가 모두 익지 못하는 상황이면 -1 출력
 *
 * 입력은 M,N으로 주어짐 (가로, 세로)
 * 저장될 때부터 모든 토마토가 익은 상태: 안익은 토마토(0)가 없는 상태
 * 토마토가 익지 못하는 경우: bfs를 돌렸을때 안 익은 토마토가 존재하는 상태
 * 토마토는 동시에 여러곳에서 익을 수 있음
 * 이미 익은 토마토는 건너뛰어야함
 * 토마토가 익으면 해당 칸에 익은일수를 +1
 *
 * 토마토를 입력할 배열
 * 토마토의 방문횟수를 확인할 배열
 * bfs를 사용하기위한 queue
 *
 * 최소일수는 tomato 배열에서 (가장 큰수 -1)
 *
 * */