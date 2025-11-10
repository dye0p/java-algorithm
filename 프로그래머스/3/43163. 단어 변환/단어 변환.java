import java.util.*;

class Solution {
    
    int answer;
    boolean[] v;
    
    public int solution(String begin, String target, String[] words) {
        v = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        return answer;
    }
    
    private void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) { 
            answer = cnt;
            return;
        }
        
        String[] beginArr = begin.split("");
        for(int i = 0; i < words.length; i++) { 
            if(!v[i]) {
               String[] wordsArr = words[i].split("");
               
               int textCnt = 0;
               for(int j = 0; j < beginArr.length; j++) {
                   if(!beginArr[j].equals(wordsArr[j])) {
                       textCnt++;
                   }
               } 
               if(textCnt == 1) {
                  v[i] = true;
                  dfs(words[i], target, words, cnt + 1);
                  v[i] = false;
               }
            }
        }
    }
}