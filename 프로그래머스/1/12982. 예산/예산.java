import java.util.*;

class Solution {
    // 문제 요약
    // 예산이 정해져 있고, 모든 물품을 살 순 없다. 최대한 많은 물품을 주자.
    // 정확히 지원해야 하며, 적은 금액을 줄 순 없다.
    // 부서의 개수는 1 이상 100 이하이다.
    // 신청 금액은 1이상 10만 이하의 자연수이다.
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < d.length; i++) {
            
            sum += d[i];
            if(sum > budget) {
                break;
            }
            cnt++;
		}
        return cnt;
    }
}