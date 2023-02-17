class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0;i<phone_number.length();i++){  // 배열의 길이를 정할땐 .length이고, 괄호를 붙이면 안된다.
            if (i < phone_number.length() - 4){
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}