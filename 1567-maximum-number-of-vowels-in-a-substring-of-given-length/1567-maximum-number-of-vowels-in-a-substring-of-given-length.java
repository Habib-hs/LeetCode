class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currentCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }

        maxCount = currentCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // Remove the char going out of the window
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }

            // Add the new char coming in
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }

            // Update max
            maxCount = Math.max(maxCount, currentCount);

            // Optimization: If max is k, we can't get better
            if (maxCount == k) {
                return k;
            }
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
