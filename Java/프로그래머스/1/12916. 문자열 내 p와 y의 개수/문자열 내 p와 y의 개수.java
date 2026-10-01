class Solution {
    boolean solution(String s) {
        int count = 0;
        
       //s.charAt(i)는 문자열을 글자 한글자 씩 쪼개서 가져옴
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') {
                count++;
            } else if (c == 'y' || c == 'Y') {
                count--;
            }
        }
        
        
        return count == 0;
    }
}
