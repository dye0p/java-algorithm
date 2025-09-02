import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int num = nums.length / 2;
        
        HashSet<Integer> hashNums = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            hashNums.add(nums[i]);
        }
        
        int size = hashNums.size();
        
        int answer = 0;
        if(size > num) {
            answer = num;
        } 
        
        if(size <= num) {
            answer = size;
        }
        return answer;
    }
}