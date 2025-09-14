import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        int range = 0;
        if(n >= m) {
            range = m;
        } else {
            range = n;
        }
        
        int a = 0;
        for(int i = 1; i <= range; i++) {
           	if(n % i == 0 && m % i == 0) {
                 a = i;
            }
        }
        
        int b = (n * m) / a;
        
        int[] answer = new int[2];
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}