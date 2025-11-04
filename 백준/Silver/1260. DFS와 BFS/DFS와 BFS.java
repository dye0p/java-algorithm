import java.io.*;
import java.util.*;

class Main {
    static int node;
    static int line;
    static int start;

    static boolean[] visited;
    static int[][] edgeArr; 
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        edgeArr = new int[1001][1001];
        visited = new boolean[1001];
        queue = new LinkedList<>();

        for(int i = 0 ; i < line ; i ++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());

            edgeArr[a][b] = edgeArr[b][a] = 1;
		}
        dfs(start);
        System.out.println();
        bfs(start);
    }

    private static void dfs(int index) {
        visited[index] = true;
        System.out.print(index + " ");

        for(int i = 1; i <= node; i++) {
            if(edgeArr[index][i] == 1 && visited[i] != true) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        visited = new boolean[1001];
        queue.offer(start);
        visited[start] = true; 

        while (!queue.isEmpty()) {
            int index = queue.poll(); 

            for(int i = 1; i <= node; i++) { 
                if(edgeArr[index][i] == 1 && visited[i] != true) {
                    queue.offer(i); 
                    visited[i] = true; 
                }
            }
            System.out.print(index + " ");
        }
    }
}