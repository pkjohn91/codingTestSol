import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger anum = new BigInteger(a);
        BigInteger bnum = new BigInteger(b);
        BigInteger sum = anum.add(bnum);
        return "" + sum;
    }
}