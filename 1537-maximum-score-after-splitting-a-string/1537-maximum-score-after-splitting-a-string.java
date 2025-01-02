class Solution {
    public int maxScore(String s) {
        int max = -1;
        int left = 0;
        int right = 0;

        // Loop to split the string at different positions
        for (int i = 0; i < s.length() - 1; i++) {
            // Count the '0's on the left side (from 0 to i)
            if (s.charAt(i) == '0') left++;

            // Count the '1's on the right side (from i+1 to end)
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') right++;
            }

            // Calculate the score at this split point
            int res = left + right;
            max = Math.max(max, res);

            // Reset right to 0 for the next split
            right = 0;
        }
        return max;
    }
}
