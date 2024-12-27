class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxPrevValue = values[0]; // Keeps track of the maximum value of values[i] + i seen so far
        
        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the pair (i, j) where i is represented by maxPrevValue
            maxScore = Math.max(maxScore, maxPrevValue + values[j] - j);
            
            // Update maxPrevValue for the next iteration
            maxPrevValue = Math.max(maxPrevValue, values[j] + j);
        }
        
        return maxScore;
    }
}