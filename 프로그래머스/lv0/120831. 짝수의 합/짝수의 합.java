class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2;i<=n;i= i+2){
            if (i % 2 == 0)
            answer = answer + i;
        }
        
        return answer;
    }
}