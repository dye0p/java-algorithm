import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeigth = 0;
        for(int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            int width = Math.max(a, b);
            int heigth = Math.min(a, b);
            
            if(width > maxWidth) {
                maxWidth = width;
            }
            
            if(heigth > maxHeigth) {
                maxHeigth = heigth;
            }
        }
        
        return maxWidth * maxHeigth;
    }
}