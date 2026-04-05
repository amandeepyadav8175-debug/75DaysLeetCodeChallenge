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
    public int diameterOfBinaryTree(TreeNode root) {
        int maxi[]= new int[1];// size is 1  and call by refreence we do int  maxi=0 then call by value 
        // maxi[0]=0;
        find(root,maxi);
         return maxi[0];
        
    }
    public int find(TreeNode root, int maxi[]){
        if(root== null) return 0;

        int leftht= find(root.left,maxi);
        int rightht= find(root.right,maxi);
        maxi[0]=Math.max(maxi[0], leftht+rightht);  //finding path

        return 1+Math.max(leftht,rightht);  // hight of tree
    }
}