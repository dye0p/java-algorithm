import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        
        int sum = 0;
        for(int i =0; i<str.length(); i++) {
            String c = strArr[i];
            
            int a = Integer.parseInt(c);
            sum += a;
        }
        
        return sum;
    }
}