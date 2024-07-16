package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 두_개_뽑아서_더하기 {

    class Solution {
        public int[] solution(int[] numbers) {

            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0; i<numbers.length - 1; i++) {
                for(int j=i + 1; j<numbers.length; j++) {
                    int n = numbers[i] + numbers[j];

                    if(!arr.contains(n)) {
                        arr.add(n);
                    }
                }
            }

            Collections.sort(arr);

            int[] answer = new int[arr.size()];

            for(int i=0; i<arr.size(); i++) {
                answer[i] = arr.get(i);
            }

            return answer;
        }
    }
}
