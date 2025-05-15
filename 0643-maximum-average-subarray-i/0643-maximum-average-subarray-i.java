class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        //simple kotha hosse amar toh avg age ber korar dokar nai, just
        //max sum ta ber korte parlei hosse, last a avg ber kore nite parbo
        
        // Step 1: Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];  // remove one from left, add one on right
            maxSum = Math.max(maxSum, sum);     // keep the max
        }

        // Step 3: Return the average
        return (double) maxSum / k;

        //Time Complexity: O(n) — sob number ekbar kore dekhchi.
        //Space Complexity: O(1) 
    }
}
