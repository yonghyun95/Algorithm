class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i<numbers.length;i++) {
            sum += numbers[i];
        }
        for(int j = 0;j<10;j++){
            sum2 += j;
        }
        answer = sum2 - sum;
        return answer;
    }
}