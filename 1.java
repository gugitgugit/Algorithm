import java.lang.StringBuilder;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int count = k;
        int startIndex = 0;
        int maxNumIndex = 0;


        StringBuilder sb = new StringBuilder();
        
        while(count > 0) {
            char maxNum = number.charAt(startIndex);
            for(int i = startIndex + 1; i < startIndex + count; i++) {  
                if(number.charAt(i) > maxNum) {
                    maxNum = number.charAt(i);
                    maxNumIndex = i;
                }
            }
            count -= maxNumIndex - startIndex;
            startIndex += maxNumIndex + 1;
                
            sb.append(maxNum);
        }

        sb.append(number.substring(maxNumIndex + 1));
        answer = sb.toString();

        return answer;
    }
}