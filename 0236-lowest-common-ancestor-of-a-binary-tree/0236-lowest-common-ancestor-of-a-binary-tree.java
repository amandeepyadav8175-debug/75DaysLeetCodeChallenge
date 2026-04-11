/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root== null || root== p|| root==q){
            return root;
        }
        TreeNode lst=lowestCommonAncestor( root.left,  p,  q);
        TreeNode rst=lowestCommonAncestor( root.right,  p,  q);
        if(lst==null){
            return rst;
        }
        else if(rst== null){
            return lst;
        } else {// lst== p || q  or rst == p|| q
            return root;
        }
        
    }
}