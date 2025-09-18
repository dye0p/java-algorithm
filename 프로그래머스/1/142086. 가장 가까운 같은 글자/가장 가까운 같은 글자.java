import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        Map<String, Integer> strMap = new HashMap<>(); 
 		
        String[] splitS = s.split("");
        
        int[] answer = new int[s.length()];
        for(int i = 0; i < splitS.length; i++) {
            String str = splitS[i];
            
            if(!strMap.containsKey(splitS[i])) {
               answer[i] = -1; 
            } else {
               answer[i] = i - strMap.get(str);
            }
            
            strMap.put(str, i);
        }
        return answer;
    }
}