/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true; 

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                
                if (leftToRight) 
                    temp.add(node.val);
                else 
                    temp.add(0, node.val); // Inserts at the beginning for reverse order

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            leftToRight = !leftToRight; 
            ans.add(temp);
        }
        return ans;
    }
}
