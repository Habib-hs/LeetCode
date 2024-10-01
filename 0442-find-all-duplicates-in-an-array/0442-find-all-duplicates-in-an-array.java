class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the index (0-based)

            // Check if the value at the index is negative
            if (nums[index] < 0) {
                // If negative, it means the number has been seen before (duplicate)
                duplicates.add(index + 1); // Add the duplicate number
            } else {
                // Otherwise, negate the value to mark it as seen
                nums[index] = -nums[index];
            }
        }

        return duplicates; // Return the list of duplicates
    }
}