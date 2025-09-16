import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
       	String[] splitS = s.split(" ", -1);
        
        for(int i = 0; i < splitS.length; i++) {
            String str = splitS[i];
           
            if(i != 0) {
               sb.append(" ");
            }
            
            for(int j = 0; j < str.length(); j++) {
                String[] splitStr = str.split("");
                
                if(j == 0 || j % 2 == 0) {
                    String upper = splitStr[j].toUpperCase();
                    sb.append(upper);
                } else if(j != 0 || j % 2 != 0) {
                    String lower = splitStr[j].toLowerCase();
                    sb.append(lower);
                }
            }
        }
        return sb.toString();
    }
}