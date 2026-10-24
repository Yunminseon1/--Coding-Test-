import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        // ArrayList갔다 다시 int로 변환 
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}