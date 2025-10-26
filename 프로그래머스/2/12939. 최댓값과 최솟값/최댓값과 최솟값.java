import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] splitS = s.split(" ");
        
        int[] intArr = new int[splitS.length];
        for(int i = 0; i < splitS.length; i++) {
            int number = Integer.parseInt(splitS[i]);
            intArr[i] = number;
        }
        
        Arrays.sort(intArr);
        
        String min = String.valueOf(intArr[0]);
        String max = String.valueOf(intArr[intArr.length - 1]);
        
        return min + " " + max;
    }
}