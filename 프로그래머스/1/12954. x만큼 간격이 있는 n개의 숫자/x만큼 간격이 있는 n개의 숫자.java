class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        
        long tmp = x;
        for(int i=0; i<n; i++) {
            arr[i] = tmp;
            
            tmp += x;
        }
        return arr;
    }
}