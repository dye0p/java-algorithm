import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
       List<Integer> answer = new ArrayList<>();
        
       int indexCnt = 0;
       for(int i = 0; i < arr.length; i++) {
           if(arr[i] % divisor == 0) {
               answer.add(arr[i]);
           }
       }
       
       if(answer.size() == 0) {
           answer.add(-1);
       }
        
       Collections.sort(answer);
       
       return answer;
    }
}