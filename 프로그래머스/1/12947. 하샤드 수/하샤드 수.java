class Solution {
    public boolean solution(int x) {
        
        //자릿수 구하기
        String str = String.valueOf(x);
        
        String[] strArr = str.split("");

        int sum = 0;
        for(String s : strArr) {
            int n = Integer.parseInt(s);
            sum += n;
        }
        
        boolean answer = true;
        
        if(x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}