import java.util.*;

class Solution {
    boolean solution(String s) {
        String[] splitS = s.split("");
        
        int cnt = 0;
        for(int i = 0; i < splitS.length; i++) {
            if(splitS[i].equals("(")) {
                cnt++;
            }
            
            else if(splitS[i].equals(")")) {
                if(cnt == 0) {
                    return false;
                }
                cnt--;
            }
        }
        
        
        if(cnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
