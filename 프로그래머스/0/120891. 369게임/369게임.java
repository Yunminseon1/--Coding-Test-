class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while (order > 0) {
            int digit = order % 10; // 일의 자리 숫자 구하기
            if (digit == 3 || digit == 6 || digit == 9) {
                answer++;
            }
            order /= 10; // 다음 자릿수로 이동
        }
        
        return answer;
    }
}
