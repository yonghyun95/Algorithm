class Solution {
    public String solution(int a, int b) {
        
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 2016년 일수 2월은 윤년이므로 29일
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int TotalDay = 0;
        
        // 월마다 일수 더해주기
        for(int i =1; i<a;i++){
            TotalDay += months[i-1];
        }
        TotalDay += b - 1; // 1월 1일부터 시작했으므로 -1 처리
        
        return days[(TotalDay + 5) % 7]; // 1월 1일 이 금요일이므로 +5로 초기값 설정
    }
}