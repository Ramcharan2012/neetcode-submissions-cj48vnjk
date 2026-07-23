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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
// 1. Listen to the Left VP
boolean isLeftSame = isSameTree(p.left, q.left);

// 2. Listen to the Right VP
boolean isRightSame = isSameTree(p.right, q.right);

// 3. Only tell the Board "true" if BOTH VPs said "true"!
return isLeftSame && isRightSame;
    }
}
