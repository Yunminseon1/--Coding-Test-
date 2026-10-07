// StringBuilder를 이용해 새로운 객체를 만들지 않고 기존 문자열 뒤에 바로 추가함
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
