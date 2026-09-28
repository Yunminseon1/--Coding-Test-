import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> daysQueue = new LinkedList<>();
        
        // 1. 각 작업별 완료까지 걸리는 일수 계산
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if (remain % speeds[i] != 0) {
                day += 1;
            }
            daysQueue.add(day);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        // 2. 큐를 돌면서 함께 배포될 수 있는 개수 카운트
        int maxDay = daysQueue.poll(); // 기준 배포일
        int count = 1; // 함께 배포되는 기능 수
        
        while (!daysQueue.isEmpty()) {
            int nextDay = daysQueue.poll();
            
            if (maxDay >= nextDay) {
                // 이전 기능과 함께 배포 가능
                count++;
            } else {
                // 새로운 배포일이 필요함
                answerList.add(count);
                count = 1;
                maxDay = nextDay;
            }
        }
        answerList.add(count); // 마지막 남은 카운트 추가
        
        // 3. 리스트를 배열로 변환
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
