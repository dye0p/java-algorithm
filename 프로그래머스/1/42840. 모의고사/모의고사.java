import java.util.*;

class Solution {
    public Set<Integer> solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i % 5]) {
                cnt[0]++;
            }
            
            if(answers[i] == two[i % 8]) {
                cnt[1]++; 
            }
            
            if(answers[i] == three[i % 10]) {
                cnt[2]++;
            }
        }
        
        Set<Integer> arr = new HashSet<>();
        
        int max = 0;
        int index = 0;
        for(int i = 0; i < 3; i++) {
            if(max <= cnt[i]) {
                 max = cnt[i];
                 index = i;
            }
        }
        
        arr.add(index + 1);
        
        for(int i = 0; i < 3; i++ ) {
                if(max == cnt[i]) {
                    arr.add(i+1);
                }
            }
        return arr;
    }
}