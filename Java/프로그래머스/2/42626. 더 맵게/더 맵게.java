import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.offer(s);
        }
        
        int answer = 0;
        
        while (pq.peek() < K) {

            if (pq.size() < 2) {
                return -1;
            }
            
            int least1 = pq.poll(); 
            int least2 = pq.poll(); 
            
            int mixed = least1 + (least2 * 2);
            pq.offer(mixed);
            answer++;
        }
        
        return answer;
    }
}
