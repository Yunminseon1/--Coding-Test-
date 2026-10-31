class Solution {
    public int solution(int n) {
        /* Math.sqrt(n)을 1로 나눈 나머지가 0이면 제곱수
           Math.sqrt(n)은 주어진 정수 n의 제곱근을 double 타입으로 
        */
        if (Math.sqrt(n) % 1 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
