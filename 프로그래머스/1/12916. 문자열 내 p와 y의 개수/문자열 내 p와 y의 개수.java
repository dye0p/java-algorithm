class Solution {
    boolean solution(String s) {
       
        String[] stArr = s.split("");        
        
        int pCnt = 0;
        int yCnt = 0;
		for( String st : stArr) {
            if("p".equals(st) || "P".equals(st)) {
               	pCnt++;
			}
            if("y".equals(st) || "Y".equals(st)){
                yCnt++;
            }
        }            
        
        boolean answer = true;
        
        if(pCnt == yCnt) {
            answer = true;
        }
        
        if(pCnt != yCnt) {
            answer = false;
        }
        
        return answer;
    }
}