import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int a = commands[i][0]; 
            int b = commands[i][1]; 
            int c = commands[i][2]; 
            
            //인덱스 a 부터 b 전까지 자르기
            int[] arrays = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(arrays); 
            
            int res = arrays[c-1];
            
            answer.add(res);
        }
        return answer;
    }
}

