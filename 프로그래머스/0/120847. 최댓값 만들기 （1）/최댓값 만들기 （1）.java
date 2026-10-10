import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers); // 배열을 자동으로 정렬해 주는 내장 함수
        
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return answer;
    }
}