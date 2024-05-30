import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        int[] tmp;
        int idx = 0;
        for(int i = 0; i < commands.length; i++) {
            int s = commands[i][0] - 1;
            int e = commands[i][1] - 1;
            int k = commands[i][2] - 1;
            tmp = new int[commands[i][1]-commands[i][0]+1];
            for(int j = s; j <= e; j++) {
                tmp[idx++] = array[j];
            }
            idx = 0;
            Arrays.sort(tmp);
            answer.add(tmp[k]);
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}