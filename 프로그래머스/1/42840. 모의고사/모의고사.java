import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] result = new int[3];
       
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i % a.length]) {
                result[0]++;
            }
            if(answers[i] == b[i % b.length]) {
                result[1]++;
            }
            if(answers[i] == c[i % c.length]) {
                result[2]++;
            }
        }
        
        int[] result2 = {result[0], result[1], result[2]};
        
        Arrays.sort(result);
        
        List<Integer> answer = new ArrayList<>();
        int max = result[2];
        for(int i = 0; i < 3; i++) {
            if(result2[i] >= max) {
                max = result2[i];
                answer.add(i+1);
            }
        }
        
        return answer;
    }
}