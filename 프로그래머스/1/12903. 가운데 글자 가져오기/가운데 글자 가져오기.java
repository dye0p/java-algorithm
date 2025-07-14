class Solution {
    public String solution(String s) {
        
        String[] stArr = s.split("");
        
        String answer = "";
        
        if(stArr.length % 2 != 0) {
            answer = stArr[stArr.length / 2];
        }
        
        else {
            answer += stArr[stArr.length / 2 - 1];
            answer += stArr[stArr.length / 2];
        }
        
        return answer;
    }
}