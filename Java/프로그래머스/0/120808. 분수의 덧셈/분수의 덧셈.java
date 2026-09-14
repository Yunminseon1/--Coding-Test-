// 1. 두 분모를 최소공배수로 맞춰준다.
// 2. 두 분수의 합을 배열에 담는다.
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = {};
        int max = 0;

        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;

        for (int i=1; i<=denom && i<=numer; i++){
            if(numer%i ==0 && denom%i==0){
                max = i;
            }
        }

        numer = numer/max;
        denom = denom/max;

        answer = new int[]{numer, denom};

        return answer;
    }
}