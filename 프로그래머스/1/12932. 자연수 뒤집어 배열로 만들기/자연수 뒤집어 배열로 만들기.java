class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        
        String[] arr = str.split("");
        
        int[] numArr = new int[arr.length];
        
        int cnt = 0;
        for(int i = numArr.length - 1; i >= 0; i--) {
            int a = Integer.parseInt(arr[i]);
            numArr[cnt] = a;
            cnt++;
        }
        
        return numArr;
    }
}