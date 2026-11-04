class Solution {
    public String solution(String my_string) {
        
        int[] counts = new int[26];
        int len = my_string.length();
        
        for (int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                counts[c - 'A']++;
            } else {
                counts[c - 'a']++;
            }
        }
        
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < 26; i++) {
            while (counts[i] > 0) {
                sb.append((char) (i + 'a'));
                counts[i]--;
            }
        }
        
        return sb.toString();
    }
}
