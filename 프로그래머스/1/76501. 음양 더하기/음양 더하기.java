class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        //배열 인덱스의 숫자 자리의 signs 자리가 true면 +, false면 -
        
        int sum = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                sum += absolutes[i];
            }
            
            else if(signs[i] == false) {
                sum -= absolutes[i];
            }
        }
        
        return sum;
    }
}