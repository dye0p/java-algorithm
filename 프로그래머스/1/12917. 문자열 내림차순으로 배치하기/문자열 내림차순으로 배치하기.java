import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
      
        String[] splitArr = s.split("");
        
        Arrays.sort(splitArr, Collections.reverseOrder());
        
        for(String c : splitArr) {
            answer += c;
        }
        
        return answer;
    }
}