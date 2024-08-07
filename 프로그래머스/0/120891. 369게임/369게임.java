class Solution {
    /*
     * 자릿수에 따라서 3,6,9를 찾아 카운트
     */
    public int solution(int order) {
        String str = String.valueOf(order);
        String[] a = str.split("");
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals("3") || a[i].equals("6") || a[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}