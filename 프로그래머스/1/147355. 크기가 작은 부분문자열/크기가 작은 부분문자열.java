import java.util.*;

class Solution {
    public int solution(String t, String p) {
        
        long pLong = Long.parseLong(p);
        int range = t.length() - p.length() + 1;
        
        int answer = 0;
        for(int i = 0; i < range; i++) { 
           String res = t.substring(i, i + p.length());
           
           long resLong = Long.parseLong(res);
           if(pLong >= resLong) {
               answer++;
           }
        }
        
        return answer;
    }
}