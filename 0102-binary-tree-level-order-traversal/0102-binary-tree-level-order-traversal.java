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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
       
        while(!q.isEmpty()){
         List<Integer>level = new ArrayList<>();
         int qSize=q.size();
         for (int i = 0; i < qSize; i++) {
           TreeNode temp = q.poll();
           level.add(temp.val) ;
           if(temp.left !=null) q.offer(temp.left);
           if(temp.right!=null) q.offer(temp.right);
         }
        result.add(level);
        }
         return result;
    }
}