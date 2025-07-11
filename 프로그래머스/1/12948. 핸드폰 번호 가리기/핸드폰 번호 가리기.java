class Solution {
    public String solution(String phone_number) {
     	String[] arr = phone_number.split("");
        
        int cnt = 1;
        for(int i = arr.length - 1; i >=0; i--) {
            
            if(cnt > 4) {
                arr[i] = "*";
            }
            
            cnt++;
        }
        
        String answer = "";
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}