class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int count =0;
        int flag=0;
        for(int i=0; i<nums.size() ; i++){
            if(val==nums[i]){
                count++;
            }else{
                nums[flag++]=nums[i];
            }
        }
        return nums.size()-count;
    }
};