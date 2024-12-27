class Solution {
    public int maxArea(int[] height) {
       int l = 0;
       int r = height.length-1; 
       int result = -1;

       while (l<r){
        int sum = Math.min(height[l], height[r])*(r-l); 
        result = Math.max(sum,result) ;
        if (height[l] < height[r]){
            l++;
        }else {
            r--;
        }
       }

       return result;
    }
}