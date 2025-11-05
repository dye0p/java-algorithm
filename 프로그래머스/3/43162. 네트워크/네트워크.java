import java.util.*;

class Solution {
    
    boolean[] v;
    
    public int solution(int n, int[][] computers) {
        
        v = new boolean[n];
        
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(v[i]) {
                continue;
            }
            else {
                Queue<Integer> q = new LinkedList<>();
            
                v[i] = true;
                q.offer(i);
            
                while(!q.isEmpty()) {
                    int value = q.poll();
                
                    for(int j = 0; j < n; j++) {
                        if(computers[value][j] == 1 && !v[j]) {
                            q.offer(j);
                            v[j] = true;
                        }
                   }
                }
                cnt++;
            }
        }
        return cnt;
    }
}