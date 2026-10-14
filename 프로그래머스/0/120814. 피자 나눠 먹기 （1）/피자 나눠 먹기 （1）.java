class Solution {
    public int solution(int n) {
        //  7(피자조각)로 나눈 몫을 answer에 저장 
        int answer = n / 7;
        
        // 사람이 7명 이상일 경우
        if (n % 7 != 0) {
            answer += 1;
        }
        return answer;
    }
}
