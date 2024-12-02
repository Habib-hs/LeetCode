/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> pq = new PriorityQueue<>((x, y) -> x.val - y.val);


       ListNode res = new ListNode() ;
       ListNode temp=res;

       for(ListNode list : lists){
          if(list!=null){
            pq.offer(list);
          }
       }
       
       while (!pq.isEmpty()) {
        ListNode node = pq.poll(); // Get the smallest node
        if (node.next != null) pq.offer(node.next); // Add the next node of this list (if exists)
            temp.next = node; 
            temp = temp.next;
      }

        return res.next; // Return the merged list (ignoring the dummy node)
    }
}
