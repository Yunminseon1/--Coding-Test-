// while은 반복횟수가 명확하지 않을때 사용, for문은 반복횟수가 정해져있을때 사용함
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
