class Solution {
    boolean solution(String s) {
        // 1. 대소문자 구분을 없애기 위해 모두 소문자로 변환
        s = s.toLowerCase();
        
        int pCount = 0;
        int yCount = 0;
        
        // 2. 문자열을 돌면서 'p'와 'y' 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }
        
        // 3. 개수가 같으면 true, 다르면 false 리턴 (0개로 같을 때도 true)
        return pCount == yCount;
    }
}
