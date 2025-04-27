class NumArray {
    // Array to store prefix sums
    int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    

    public int sumRange(int left, int right) {
        // If the range starts from index 0, return prefix[right] directly
        if(left == 0)
            return prefix[right];

        // Otherwise, subtract the prefix sum up to left-1 to get the range sum
        return prefix[right] - prefix[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */