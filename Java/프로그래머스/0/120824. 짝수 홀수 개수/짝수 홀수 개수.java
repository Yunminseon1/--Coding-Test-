class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // [0]: 짝수 개수, [1]: 홀수 개수
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++; // 짝수일 때
            } else {
                answer[1]++; // 홀수일 때
            }
        }
        
        return answer;
    }
}
