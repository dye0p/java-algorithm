import java.util.*;

class Solution {
    public long solution(long n) {
       
        String stArr = String.valueOf(n);
        String[] splitArr = stArr.split("");
        
        Arrays.sort(splitArr, Collections.reverseOrder());
        
        String newSt = "";
        
        for(String st : splitArr) {
            newSt += st;
        }
        
        long answer = Long.parseLong(newSt);
        
        return answer;
    }
}