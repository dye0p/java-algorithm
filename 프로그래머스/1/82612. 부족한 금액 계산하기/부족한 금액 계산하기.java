import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = 0L;
        for(int i = 1; i <= count; i++) {
           sum += price * i;
        }
        
        if(sum > money) {
            sum -= money;
        }
        
        else {
            sum = 0L;
        }

        return Math.abs(sum);
    }
}