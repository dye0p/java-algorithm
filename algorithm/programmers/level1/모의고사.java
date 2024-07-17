package programmers.level1;

import java.util.ArrayList;

public class 모의고사 {

    class Solution {

        public int[] solution(int[] answers) {

            //수포자들이 찍는 패턴
            int[][] pattern = {
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
            };

            //수포자들의 점수를 저장
            int[] scores = new int[3];

            //답지와 수포자들의 점수를 비교
            for(int i=0; i<answers.length; i++) {
                for(int j=0; j<scores.length; j++) {
                    if(answers[i] == pattern[j][i % pattern[j].length]) {
                        scores[j]++;
                    }
                }
            }

            //동점자가 발생있을수도 있으므로 동적배열으로 선언
            ArrayList<Integer> arr = new ArrayList<>();

            int maxScore = 0;

            for(int i=0; i<scores.length; i++) {
                if(scores[i] > maxScore) {
                    maxScore = scores[i];
                }
            }

            //결과 배열에 최고점자 인덱스값 저장
            for(int i=0; i<scores.length; i++) {
                if(maxScore == scores[i]) {
                    arr.add(i + 1);
                }
            }
            //리스트를 배열로 변환
            int[] answer = new int[arr.size()];

            for(int i=0; i<arr.size(); i++) {
                answer[i] = arr.get(i).intValue();
            }
            return answer;
        }
    }
}
