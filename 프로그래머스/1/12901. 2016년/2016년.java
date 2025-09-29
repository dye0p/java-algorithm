import java.time.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        
        LocalDate date = LocalDate.of(2016, a, b);
        
        String dayOfWeek = date.getDayOfWeek().toString();
        
        String answer = dayOfWeek.substring(0,3);
        
        return answer;
    }
}