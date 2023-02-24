class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
         for (int i = 0; i<numbers.length;i++){ // 갯수
             answer += numbers[i];
         }
         answer = answer / numbers.length; // numbers.length - 갯수를 뜻한다.
        
        return answer;
    }
}