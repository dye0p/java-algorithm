import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        //참여자 해시맵 생성
        for(int i = 0; i < participant.length; i++) {
            String name = participant[i];
            
            if(map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
            
            else {
                map.put(name, 1);
            }
        }
        
        //완주자 검증
        for(int j = 0; j < completion.length; j++) {
            String name = completion[j];             
            
            map.put(name, map.get(name) - 1);
        }
        
        //완주 하지 못한 참여자 검증
        for(int i = 0; i < participant.length; i++) {
            String name = participant[i];
            
            if(map.get(name) > 0) { 
                answer = name;
            }
        }
        return answer;
    }
}