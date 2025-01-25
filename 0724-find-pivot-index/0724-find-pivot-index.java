class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum = 0;
        for (int num: nums) prefixSum+=num;
        int pre=0;

        for(int i=0; i<nums.length; i++){
         if(prefixSum-nums[i]-pre == pre){
            return i;
         }
         pre = pre+nums[i];
        }
        return -1;
    }
}