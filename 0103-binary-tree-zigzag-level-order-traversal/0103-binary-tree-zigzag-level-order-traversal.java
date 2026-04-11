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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res= new LinkedList<>();
         if(root== null) return res;
         Queue<TreeNode> q= new LinkedList<>();
         int level=0;
         q.offer(root);
         while(!q.isEmpty()){
            int size= q.size();
            List<Integer> sublist= new LinkedList<>();// reset at each level
            while(size>0){
                  TreeNode node = q.poll();
                // odd
                if(level%2!=0){
                    sublist.addFirst(node.val);// this is insertion of header prpperty at 0(1) int the linked list to avoid reverse add
                }else{
                    sublist.add(node.val);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }

                
                size--;
            }
            level++;
            res.add(sublist);
         }
         return res;
        
    }
}