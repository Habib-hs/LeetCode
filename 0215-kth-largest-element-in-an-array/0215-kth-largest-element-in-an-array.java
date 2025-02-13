class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        return pq.poll();
    }
}