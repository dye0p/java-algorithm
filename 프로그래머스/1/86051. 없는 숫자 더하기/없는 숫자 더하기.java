class Solution {
    public int solution(int[] numbers) {
        
        int maxSum = 45;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        int answer = maxSum - sum;
  
        return answer;
    }
}