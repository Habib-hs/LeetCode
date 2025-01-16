class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        //concept is same as sums equal to k
        unordered_map<int, int>prevSum;
        //if divisible directly then rem will be 0 for that rem first I set it rem 0 to 1
        prevSum[0]=1;
        int count=0, sum=0, rem=0;

        for(int i=0; i<nums.size(); i++){
            sum=sum+nums[i];
            rem = sum%k;
            //for negative num rem should not be negative so I add it with k 
            //like -7/5 = -2 so -2+5= 3 so rem 3 is correct for that
            if(rem<0) rem=rem+k;
            
            //if rem is present in our array we will add it's value to count
            if(prevSum.find(rem)!=prevSum.end()){
                count+=prevSum[rem];
            }
            //we will add rem to map either it present or or. 
            prevSum[rem]++;
        }

        return count;
    }
};