package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {

    static int n, m;
    //방문처리와 초를 카운트하기위한 배열
    static int[] vis = new int[100002];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        if (n == m) {
            System.out.println(0);
        } else {
            bfs(n);
        }
    }

    static void bfs(int x) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(x); //수빈이의 위치에서 bfs 시작
        vis[x] = 1; //한번 도착한 곳은 방문처리

        while (!q.isEmpty()) {
            int p = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = p + 1;
                } else if (i == 1) {
                    next = p - 1;
                } else {
                    next = 2 * p;
                }

                if (next == m) {
                    System.out.println(vis[p]);
                    return;
                }

                if (next >= vis.length || next < 0) {
                    continue;
                }

                if (vis[next] == 0) {
                    q.offer(next);
                    vis[next] = vis[p] + 1;
                }
            }
        }


    }
}
