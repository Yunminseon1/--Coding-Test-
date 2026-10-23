import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 우선순위 큐에 모든 스코빌 지수 삽입
        for (int s : scoville) {
            pq.offer(s);
        }
        // 가장 작은 스코빌 지수가 K 미만인 동안 반복 
        while (pq.peek() < K) {
            // 더 이상 섞을 음식이 없다면 -1 반환
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();  // 가장 맵지 않은 음식
            int second = pq.poll(); // 두 번째로 맵지 않은 음식

            int mixed = first + (second * 2);
            pq.offer(mixed);
            answer++;
        }

        return answer;
    }
}
