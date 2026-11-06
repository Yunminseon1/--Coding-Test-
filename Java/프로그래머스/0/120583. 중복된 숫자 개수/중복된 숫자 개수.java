// 배열에서 n을 센다.
// 개수를 반환한다.
class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        
        for(int i = 0; i < array.length; i++){
            if (array[i] == n){
                count ++;
            } 
        }
        return count;
    }
}