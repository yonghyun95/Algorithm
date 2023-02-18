import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
         String str = String.valueOf(n); // 형 변환
        String[] str2 = str.split("");
        Arrays.sort(str2, Collections.reverseOrder());
        
        str = String.join("", str2);
        answer = Long.parseLong(str);
        
        return answer;
    }
}