class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;      // number of rows
        int m = image[0].length;   // number of columns

        // Step 1: flip each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left <= right) { 
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }

        // Step 2: invert image (0 ↔ 1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }

        return image;
    }
}