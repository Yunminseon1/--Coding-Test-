class Solution {
    public String solution(String my_string) {
        // a, e, i, o, u를 문자배열에 저장함
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String answer = "";
        
        // 주어진 문자열을 한글자씩 탐색함 
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            boolean isVowel = false;
            
            // 현재 문자에 모음이 있는지 확인함
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
            // 모음이 아니면 결과 문자열에 저장함 
            if (!isVowel) {
                answer += ch;
            }
        }

        return answer;
    }
}