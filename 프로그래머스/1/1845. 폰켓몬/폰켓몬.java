import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        //가져갈 수 있는 포켓몬 개수
        int get = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        
        //중복 숫자를 제거한 set 생성
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        //set의 길이가 1이면 무조건 1리턴
        if(set.size() == 1) {
            answer = 1;
        }
        
        //get과 set이 같거나 set이 더 작다면 set size 리턴
        if(set.size() <= get) {
            answer = set.size();
        }
        
        //set 크기보다 get이 더 작다면
        if(set.size() > get) {
            answer = get;
        }
        
        return answer;
    }
}