import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 알고리즘: 브루트 포스 (완전탐색)
        // 1. 올림차순 정렬
        Arrays.sort(mats);
        
        // 2. 완전 탐색: 가장 큰 돗자리부터
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            
            // 3. 공원의 모든 좌표 탐색
            if (findPlace(size, park)) return size;
        }
        
        // 4. 어떤 돗자리도 깔수 없으면 -1
        return -1;
    }
    
    private boolean findPlace(int size, String[][] park) {
        int row = park.length;
        int col = park[0].length;
        
        // 돗자리가 공원 범위 벗어나지 않게 설정
        for (int r = 0; r <= row - size; r++) {
            for (int c = 0; c <= col - size; c++) {
                // size * size 크기가 모두 -1인가
                if (isEmpty(r, c, size, park)) return true;
            }
        }
        return false;
    }
    
    private boolean isEmpty(int startR, int startC, int size, String[][] park) {
        for (int i = startR; i < startR + size; i++) {
            for (int j = startC; j < startC + size; j++) {
                // -1이 아니라면
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}