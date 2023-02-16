class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = my_string.length()-1;i >= 0; i-- ){    
            answer += my_string.charAt(i);  // string변수명.chatAt() <- 문자열의 char 타입으로 바꿔주는 함수 
        }
        
        
        return answer;
    }
}