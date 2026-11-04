import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 모든 문자를 소문자로 변환한 뒤 char 배열로 변환함 
        char[] arr = my_string.toLowerCase().toCharArray();
        
        // 2. 오름차순 정렬
        Arrays.sort(arr);
        
        // 3. String으로 변환하여 반환
        return new String(arr);
    }
}
