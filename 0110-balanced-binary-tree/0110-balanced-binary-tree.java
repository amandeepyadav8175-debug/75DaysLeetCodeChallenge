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
    public boolean isBalanced(TreeNode root) {
        int height= getheight( root);
        if(height== -1) return false;
        return true;        
    }
    //dfs
    public int getheight(TreeNode root){
        if(root==null) return 0;
        int lst=getheight( root.left);
        int rst=getheight( root.right);
        if(lst== -1|| rst== -1){
            return -1;
        }
        if(Math.abs(lst-rst)>1){
            return -1;
        }
        return 1+Math.max(lst,rst);

    }
}