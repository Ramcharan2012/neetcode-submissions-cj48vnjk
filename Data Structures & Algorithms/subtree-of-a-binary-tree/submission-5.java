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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot!=null) return false;
        if(subRoot==null) return true;
            if (isSametree(root, subRoot)) {
        return true; 
    }
        boolean leftTree=isSubtree(root.left,subRoot);
        boolean rightTree=isSubtree(root.right,subRoot);
        return leftTree||rightTree;
    }

        public boolean isSametree(TreeNode p, TreeNode q) {
            if(p==null&&q==null) return true;
            if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        boolean isleftTree=isSametree(p.left,q.left);
        boolean isrightTree=isSametree(p.right,q.right);
        return isleftTree && isrightTree;
    }
}
