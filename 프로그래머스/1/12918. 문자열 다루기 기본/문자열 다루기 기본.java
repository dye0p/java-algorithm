class Solution {
    public boolean solution(String s) {
        
        String[] splitS = s.split("");
        
        boolean flag = true;
        if(splitS.length == 4 || splitS.length == 6)
           for(String str : splitS) {
               try {
                   Integer.parseInt(str);
               }
               catch(NumberFormatException e) {
                   flag = false;
               }
           }
        else {
            flag = false;
        }
        return flag;
    }
}