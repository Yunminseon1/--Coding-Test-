// hp가 주어졌을때 최소병력으로 구성하기 
class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        hp %= 5;
        
        answer += hp / 3;
        hp %= 3;
        
        answer += hp / 1;
        
        return answer;
    }
}
