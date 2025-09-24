import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
            
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            String str = strings[i].charAt(n) + strings[i];
            list.add(str);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < strings.length; i++) {
            String ss = list.get(i).substring(1);
            answer[i] = ss;
        }
        
        return answer;
    }
}