import java.util.*;

class Solution {
    
    //3명의 정수 번호를 더했을때 0이 되면 삼총사
    //정수 배열이 주어졌을 때 삼총사를 만들 수 있는 방법 return
    
    // 배열의 길이는 3~13
    // 서로다른 학생의 번호가 같을 수 있다.
    public int solution(int[] number) {
        int cnt = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}