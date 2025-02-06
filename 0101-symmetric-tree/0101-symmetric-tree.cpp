/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
  bool sym(TreeNode* leftNode, TreeNode* rightNode){
      if(leftNode == NULL && rightNode !=NULL) return false;
      if(leftNode!=NULL && rightNode==NULL) return false;
       if(leftNode == rightNode) return true;
      if(leftNode->val != rightNode->val) return false;
     

      return sym(leftNode->left, rightNode->right) && 
             sym(leftNode->right, rightNode->left);
  }

    bool isSymmetric(TreeNode* root) {
        if(root == NULL) return false;
       return sym(root->left, root->right) ;
       
    }


};