import java.util.*;

class Solution {
    public int solution(int n) {
        
        String a = Integer.toString(n, 3); 
        
        StringBuffer sb = new StringBuffer(a);
        String reverseSb = sb.reverse().toString(); 
        
        int answer = Integer.parseInt(reverseSb, 3);
        return answer;
    }
}