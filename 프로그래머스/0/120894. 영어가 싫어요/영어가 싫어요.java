class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] a = {"zero", "one", "two", "three", "four", "five",
                      "six", "seven", "eight", "nine"};
        for(int i = 0; i < a.length; i++) {
            numbers = numbers.replaceAll(a[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}