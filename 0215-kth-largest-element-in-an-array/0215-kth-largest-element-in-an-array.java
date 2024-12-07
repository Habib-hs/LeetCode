class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a max-heap using a PriorityQueue with a custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);

        // Add all elements from the array into the max-heap
        for (int num : nums) {
            pq.offer(num); // Elements will be ordered by descending priority
        }

         
        int result = 0;  
        
        // Store the size of the queue
        int size = pq.size(); 


        for (int i = 1; i <= size; i++) {
            if (i == k) {
                result = pq.poll(); // Extract the kth largest element
                break; 
            } else {
                pq.poll(); // Remove elements until the kth element is reached
            }
        }

        // Return the kth largest element
        return result;
    }
}
