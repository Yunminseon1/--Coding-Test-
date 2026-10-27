import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        int A = sides[0];
        int B = sides[1];
        int C = sides[2];

        if (C < A + B) {
            return 1;
        } else {
            return 2;
        }
    }
}