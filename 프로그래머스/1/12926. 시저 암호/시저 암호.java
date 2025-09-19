
class Solution {
    public String solution(String s, int n) {
        
        char[] charS = s.toCharArray();
        
        String answer = "";
        for(char c : charS) {
            if(c == ' ') {
                answer += " ";
            } else if(c >= 'A' && c <= 'Z') {
                char shifed = (char)(((c - 'A' + n) % 26) + 'A');
                answer += shifed;
            } else if(c >= 'a' && c <= 'z') {
                char shifed = (char)(((c - 'a' + n) % 26) + 'a');
                answer += shifed;
            }
        }
        
        return answer;
    }
}