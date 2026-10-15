class Solution {
    public int solution(int n) {
        int a = n;
        int b = 6;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = n * 6 / gcd;

        return lcm / 6;
    }
}