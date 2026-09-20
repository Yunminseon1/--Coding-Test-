class Solution {
    public long[] solution(int x, int n) {
       
        long[] answer = new long[n];
        
            for (int i = 0; i < n; i++) {
            // 오버플로우 방지를 위한 형변환
            answer[i] = (long)x * (i + 1);
        }
        
        return answer;
    }
}
