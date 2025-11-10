import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] sArr = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sArr.length; i++) {
            String s1 = sArr[i];
            
            if(s1.length() == 0) {
                sb.append(" ");
            }
            else {
                String s2 = s1.substring(1, s1.length()).toLowerCase();
                String s3 = s1.substring(0,1).toUpperCase();
                
                sb.append(s3);
                sb.append(s2);
                sb.append(" ");
            }
        }
        
        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
            return sb.toString();
        }
        
        return sb.toString().trim();
        }
    }