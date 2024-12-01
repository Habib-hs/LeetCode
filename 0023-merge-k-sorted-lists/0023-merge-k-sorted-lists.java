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
        // Step 1: Collect all values from the linked lists into an array
        List<Integer> values = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                values.add(list.val);
                list = list.next;
            }
        }

        // Step 2: Sort the array
        Collections.sort(values);

        // Step 3: Create a new linked list from the sorted array
        ListNode dummy = new ListNode(0); // Dummy node
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; // Return the merged list (ignoring the dummy node)
    }
}
