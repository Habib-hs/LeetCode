class Solution {

    public boolean isVowel(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
       int result =0;
    for (int i=0; i<k; i++)  {
        if (isVowel(s.charAt(i))){
           result++;
        }
    }
     int maxResult = result;
     int left = 0;

     for (int right = k; right<s.length(); right++){
        if (isVowel(s.charAt(left))){
            result--;
          
        }
         if (isVowel(s.charAt(right))){
            result++;
        }

        left++;
        maxResult=Math.max(maxResult,result);
     }
      
        return maxResult;
    }
}