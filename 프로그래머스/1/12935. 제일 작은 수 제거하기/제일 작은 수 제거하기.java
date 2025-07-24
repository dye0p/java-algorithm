import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        
        int[] copyArr = arr.clone();
        
        Arrays.sort(arr);
        
        int min = arr[0];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(copyArr[i] != min) {
                list.add(copyArr[i]);
            }
        }
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        return list;
    }
}