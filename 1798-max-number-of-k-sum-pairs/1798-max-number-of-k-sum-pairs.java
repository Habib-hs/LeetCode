class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int right= nums.length-1;
        int left = 0;
        int result =0;
        while (left< right){
            int addition =nums[left]+nums[right];
            if (addition==k){
                result++;
                left++;
                right--;
            }else if(addition>k){
                right--;
            }else{
                left++;
            }

        }
    return result;
    }
}