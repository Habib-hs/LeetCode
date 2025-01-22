class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int totalSubArrayCount = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {  
            prefixSum = prefixSum + nums[i];
            int remove = prefixSum - k;

            // Check if remove exists in map before adding to count
            if (map.containsKey(remove)) {
                totalSubArrayCount += map.get(remove);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return totalSubArrayCount;
    }
}
