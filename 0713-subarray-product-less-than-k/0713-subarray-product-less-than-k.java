class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // Edge case: k <= 1, no product can be less than k

    int productCount = 0;
    int left = 0;
    int product = 1;

    for (int right = 0; right < nums.length; right++) {
        product *= nums[right]; // Expand the window

        // Shrink the window if product is too large
        while (product >= k && left <= right) {
            product /= nums[left];
            left++;
        }

        // Count all subarrays ending at 'right'
        productCount += (right - left + 1);
    }

    return productCount;
    }
}