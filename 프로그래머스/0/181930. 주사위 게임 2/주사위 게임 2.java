class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int power = (int) Math.pow(a, 2) + 
                    (int) Math.pow(b, 2) + 
                    (int) Math.pow(c, 2);
        int power3 = (int) Math.pow(a, 3) +
                     (int) Math.pow(b, 3) +
                     (int) Math.pow(c, 3);
        
        return (a != b && b != c && a != c) ? sum : ((a == b && b == c) ? sum * power * power3 : sum * power);
    }
}