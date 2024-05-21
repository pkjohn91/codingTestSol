class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1); // 마지막 공백 하나 더 늘림
        int[] result = new int[str.length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = str[i].length();
        }
        return result;
    }
}