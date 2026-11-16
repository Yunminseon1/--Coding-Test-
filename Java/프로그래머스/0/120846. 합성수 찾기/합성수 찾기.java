import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() > 2)
                .count();
    }
}
