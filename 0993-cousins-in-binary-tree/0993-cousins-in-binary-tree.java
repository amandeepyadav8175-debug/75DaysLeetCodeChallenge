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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root== null) return false;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int foundchild=0;
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                int sameparentchild=0;// reset 0 to 1 and then 0 
                TreeNode node= q.poll();
                if(node.left!=null){
                    if(node.left.val == x || node.left.val==y){
                        sameparentchild++;
                         foundchild++;
                    }
                    q.offer(node.left);
                }
                if(node.right!=null){
                     if(node.right.val == x || node.right.val==y){
                        sameparentchild++;
                         foundchild++;
                     }
                    q.offer(node.right);
                }
                 if(sameparentchild== 2) return false; //why inside for lop brcuse variale decl
        }
        if(foundchild==2) return true;
         if(foundchild==1) return false;
       
        }
       return false;
        
    }
}