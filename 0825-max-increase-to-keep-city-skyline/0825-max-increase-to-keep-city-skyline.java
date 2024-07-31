class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] maxRows = new int[n];
        int[] maxColumns = new int[n];
        int countSum = 0;
        
        // Find maximum heights for each row and column
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                maxColumns[j] = Math.max(maxColumns[j], grid[i][j]);
                maxRows[i] = Math.max(maxRows[i], grid[i][j]);
            }
        }
        
        // Calculate the sum of increases
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                countSum += Math.min(maxColumns[j], maxRows[i]) - grid[i][j];
            }
        }
        
        return countSum;
    }
}