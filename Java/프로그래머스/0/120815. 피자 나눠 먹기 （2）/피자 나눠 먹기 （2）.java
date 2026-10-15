// n과 6의 최소공배수 구하고 6으로 나눈값 출력
class Solution {
    public int solution(int n) {
        int i = 1;

        while (true) {
            if (n * i % 6 == 0) {
                return n * i / 6;
            }
            i++;
        }
    }
}