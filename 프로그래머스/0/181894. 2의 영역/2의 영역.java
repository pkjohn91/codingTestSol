import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int max = 0;
        int min = 100000;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        
        if(max >= min) {
            return Arrays.copyOfRange(arr, min, max+1);
        } else {
            return new int[]{-1};
        }
        
    }
}
