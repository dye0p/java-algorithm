import java.util.*;

public class Solution {
    public Stack<Integer> solution(int[] arr) {
        
        Stack<Integer> answer = new Stack<>();
        answer.push(arr[0]);
        
        for(int i = 0; i < arr.length; i++) {
            if(answer.peek() != arr[i]) {
                answer.push(arr[i]);
            }
        }
        return answer;
    }
}