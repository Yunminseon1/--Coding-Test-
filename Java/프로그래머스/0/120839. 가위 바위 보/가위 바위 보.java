class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i< rsp.length(); i++){
            char c = rsp.charAt(i);
            
            if(c == '2'){
                answer += "0"; // 가위 -> 바위
            }else if(c == '0'){
                answer += "5"; // 바위 -> 보
            }else if(c == '5'){
                answer += "2"; // 보 -> 가위
            }
        }
        return answer;
    }
}