class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] store = new int[256];
        int left =0, right=0, maxLength=0;

        while (right<s.length()){
            store[s.charAt(right)]++; 
            while (store[s.charAt(right)] > 1) {
                store[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }

        return maxLength;
    }
}