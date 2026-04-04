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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> res= new ArrayList<>();
         Stack<TreeNode> stack= new Stack<>();
         TreeNode node = root;
         while (node!= null|| !stack.isEmpty()){
            // move to the left
            while(node!= null){// loop inside loop same work
             stack.push(node);
             node= node.left;
            }
            if(stack.peek().right!= null){
                node= stack.peek().right;
            }else{// peek ka right null hai to toh last wala node pop and print
                TreeNode temp= stack.pop();
                res.add(temp.val);
                while( !stack.isEmpty()  && temp== stack.peek().right){// this is right skewed
                                                    // tree if temp peek ka right hai toh pop,
                                                    // print and backtrack and print 
                    temp= stack.pop();
                    res.add(temp.val);
                }
            }
           
            
         }
         return  res;

        
    }
}