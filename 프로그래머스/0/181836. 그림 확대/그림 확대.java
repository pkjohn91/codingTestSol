class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        int kRows = rows * k;
        int kCols = cols * k;
        
        String[] kPicture = new String[kRows];
        StringBuffer sb;
        for(int i = 0; i < kRows; i++) {
            sb = new StringBuffer();
            int row = i / k;
            for(int j = 0; j < kCols; j++) {
                int col = j / k;
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }
            kPicture[i] = sb.toString();
        }
        return kPicture;
    }
}