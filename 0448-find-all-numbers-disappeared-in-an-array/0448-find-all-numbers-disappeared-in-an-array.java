class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>answer = new ArrayList<>();

        for (int num : nums) {
          map.put(num, map.getOrDefault(num, 0) + 1);
        }

      // Check for numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                answer.add(i); 
            }
        }
 
      return answer;
    }
}