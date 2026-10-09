class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                answer = 1; // 제1사분면 (+, +)
            } else {
                answer = 4; // 제4사분면 (+, -)
            }
        } else {
            if (dot[1] > 0) {
                answer = 2; // 제2사분면 (-, +)
            } else {
                answer = 3; // 제3사분면 (-, -)
            }
        }
        
        return answer;
    }
}
